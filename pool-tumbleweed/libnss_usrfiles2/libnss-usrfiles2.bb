SUMMARY = "NSS usrfiles plugin for glibc"
DESCRIPTION = "The NSS usrfiles plugin additionally looks in /usr/etc for passwd, \
group, rpc, services, protocols and more."
LICENSE = "LGPL-2.1-only"

PV = "2.27"

RPM_NAME = "libnss_usrfiles2-2.27-3.15.aarch64.rpm"
RPM_HASH = "19ee32a217f939a7f49b631f16f745e7b5546b0982122879f5d1a5a159336c5b6f2155bbe22c4a82e0f9278db4d80774e2923bd2dfe889c847141576c52cb107"

RPROVIDES:${PN} += "libnss-usrfiles.so.2 \
libnss-usrfiles2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
