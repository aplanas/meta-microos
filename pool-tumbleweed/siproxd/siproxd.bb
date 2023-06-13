SUMMARY = "A SIP masquerading proxy with RTP support"
DESCRIPTION = "Siproxd is an proxy/masquerading daemon for the SIP protocol. It handles \
registrations of SIP clients on a private IP network and performs \
rewriting of the SIP message bodies to make SIP connections possible \
via an masquerading firewall. It allows SIP clients (like kphone, \
linphone) to work behind an IP masquerading firewall or router."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.3"

RPM_NAME = "siproxd-0.8.3-3.10.aarch64.rpm"
RPM_HASH = "384f7bea7330ccc8a6161a5fda8d06f6e2c7e01a15752585baca189d8de5acfb8ddcf9df44eb3a5d9d86994029763431a8f68ce2d9985acd033f91a4427133e6"

RPROVIDES:${PN} += "config(siproxd) \
siproxd \
siproxd(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/sbin/groupadd \
/usr/sbin/useradd \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libltdl.so.7()(64bit) \
libosipparser2.so.15()(64bit) \
libsqlite3.so.0()(64bit) \
logrotate"

inherit rpm
