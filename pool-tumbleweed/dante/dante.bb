SUMMARY = "A SOCKSv4 and v5 client implementation"
DESCRIPTION = "Dante is an implementation of the following proxy protocols: SOCKS \
version 4, SOCKS version 5 (RFC 1928), and msproxy. It can be used as a \
firewall between networks."
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "dante-1.4.3-2.8.aarch64.rpm"
RPM_HASH = "5317068b75e616f4bc3672ef884a5d773c378e2a27d2e1172f93599d4bbacf0242a9ecd8a61d303d3b338a83a8124da5e33d18a01011e55fed6096fda5c2db42"

RPROVIDES:${PN} += "config(dante) \
dante \
dante(aarch-64) \
libdsocks.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libminiupnpc.so.17()(64bit)"

inherit rpm
