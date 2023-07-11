SUMMARY = "A SOCKSv4 and v5 client implementation"
DESCRIPTION = "Dante is an implementation of the following proxy protocols: SOCKS \
version 4, SOCKS version 5 (RFC 1928), and msproxy. It can be used as a \
firewall between networks. \
 \
This package contains the dynamic libraries required to make existing \
applications become socks clients."
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "libsocks0-1.4.3-2.9.aarch64.rpm"
RPM_HASH = "759111b3c948f2e554cd87b6a2a9da3ec47cc7b6689a4e77bf8fc1fcd0c84e789c04a6418e08e7ace278a1c60417533f4b8bf8bf7009ea172eecf3cc435deb97"

RPROVIDES:${PN} += "libsocks.so.0 \
libsocks0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2 \
libminiupnpc.so.17"

inherit rpm
