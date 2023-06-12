SUMMARY = "NSS usrfiles plugin for glibc"
DESCRIPTION = "The NSS usrfiles plugin additionally looks in /usr/etc for passwd, \
group, rpc, services, protocols and more."
LICENSE = "LGPL-2.1-only"

PV = "2.27"

RPM_NAME = "libnss_usrfiles2-2.27-3.14.aarch64.rpm"
RPM_HASH = "1d0d37868af4532d7f3e4164bd00b9117c11f00b08dda74e4631296c9d9d6573eb2abded5bc43e4989898ce267fbea24e4d1e35ba0f43621f5621fb4d02392b1"

RPROVIDES:${PN} += "libnss_usrfiles.so.2()(64bit) \
libnss_usrfiles.so.2(NSS_USRFILES_PRIVATE_2.0)(64bit) \
libnss_usrfiles2 \
libnss_usrfiles2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
