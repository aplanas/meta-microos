SUMMARY = "Configurable IDENT Server That Supports NAT/IP Masquerading"
DESCRIPTION = "Oidentd is an ident (rfc1413 compliant) daemon that runs on Linux, \
Darwin, FreeBSD, OpenBSD, NetBSD, and Solaris.	oidentd can handle IP \
masqueraded/NAT connections on Linux, Darwin, FreeBSD (ipf only), \
OpenBSD, and  NetBSD.  Oidentd has a flexible mechanism for specifying \
ident responses.  Users can be granted permission to specify their own \
ident responses.  Responses can be specified according to host and port \
pairs."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.0"

RPM_NAME = "oidentd-3.1.0-2.2.aarch64.rpm"
RPM_HASH = "dc4705356366f43507042e499fe22465ddca498c4973ae7b1b77fdc2bb0a61045433031c3f130b623f7b973821b30b45045f413a336ad2919f8e137f872fe623"

RPROVIDES:${PN} += "config-oidentd \
oidentd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
systemd"

inherit rpm
