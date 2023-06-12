SUMMARY = "A SOCKSv4 and v5 client implementation"
DESCRIPTION = "Dante is an implementation of the following proxy protocols: SOCKS \
version 4, SOCKS version 5 (RFC 1928), and msproxy. It can be used as a \
firewall between networks. \
 \
This package contains the dynamic libraries required to make existing \
applications become socks clients."
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "libsocks0-1.4.3-2.8.aarch64.rpm"
RPM_HASH = "deaecaa7e86ae94aca73c011288d5751e0c49bef176923df57199bd57031c9ba70f51e42cedf13b41b8e30e49b5c0c62e618607025ea0d1eccf6648b9084188a"

RPROVIDES:${PN} += "libsocks.so.0()(64bit) \
libsocks0 \
libsocks0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libminiupnpc.so.17()(64bit)"

inherit rpm