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

RPM_NAME = "oidentd-3.1.0-2.1.aarch64.rpm"
RPM_HASH = "f150755a9fab5caebef0225e879a5727662741355fc4e2483a14360569ba63327c0804535f26e180bea33a94b588c95548224f6f9060b6270e6a5dd0e321ae1f"

RPROVIDES:${PN} += "config-oidentd \
oidentd"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
systemd"

inherit rpm
