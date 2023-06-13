SUMMARY = "AV1 codec library"
DESCRIPTION = "This is a library for AOMedia Video 1 (AV1), an open, royalty-free \
video coding format designed for video transmissions over the Internet."
LICENSE = "BSD-2-Clause"

PV = "3.6.1"

RPM_NAME = "libaom3-3.6.1-1.1.aarch64.rpm"
RPM_HASH = "e1efe2f682b72bd4b4e818aeeca5afbae97c69db1f4c49a68cf3fd9814cf2f0fd9db75fcf483ef414f8da20be152b7a6861db02270dd013700e98abd7f5d0327"

RPROVIDES:${PN} += "libaom.so.3()(64bit) \
libaom3 \
libaom3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
