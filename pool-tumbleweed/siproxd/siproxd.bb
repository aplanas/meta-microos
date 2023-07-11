SUMMARY = "A SIP masquerading proxy with RTP support"
DESCRIPTION = "Siproxd is an proxy/masquerading daemon for the SIP protocol. It handles \
registrations of SIP clients on a private IP network and performs \
rewriting of the SIP message bodies to make SIP connections possible \
via an masquerading firewall. It allows SIP clients (like kphone, \
linphone) to work behind an IP masquerading firewall or router."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.3"

RPM_NAME = "siproxd-0.8.3-3.12.aarch64.rpm"
RPM_HASH = "a3378c5f804f800659ceb5dd632e820185e4eaf87323241614c99316fc75bf8d97906956bb587b330630c36d6cfba7e1f4069d253ef03d1c0330d11ae50ad62c"

RPROVIDES:${PN} += "config-siproxd \
siproxd"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/sbin/groupadd \
/usr/sbin/useradd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libltdl.so.7 \
libosipparser2.so.15 \
libsqlite3.so.0 \
logrotate"

inherit rpm
