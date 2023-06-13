SUMMARY = "Development files for squirrel"
DESCRIPTION = "This package contains runtime library for Squirrel"
LICENSE = "MIT"

PV = "3.2"

RPM_NAME = "libsquirrel1001-3.2-2.2.aarch64.rpm"
RPM_HASH = "f04defb43e82ac59d2193f10e2d00d784f488f4aa92ab93df3be97e0fde6504b2ae9d3ad4834de8cb704ce7973b6e282073f0d1613d61155ae084976b226d142"

RPROVIDES:${PN} += "libsqstdlib3.so.1001()(64bit) \
libsquirrel1001 \
libsquirrel1001(aarch-64) \
libsquirrel3.so.1001()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit)"

inherit rpm
