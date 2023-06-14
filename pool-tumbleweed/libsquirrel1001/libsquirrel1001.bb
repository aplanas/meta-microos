SUMMARY = "Development files for squirrel"
DESCRIPTION = "This package contains runtime library for Squirrel"
LICENSE = "MIT"

PV = "3.2"

RPM_NAME = "libsquirrel1001-3.2-2.2.aarch64.rpm"
RPM_HASH = "f04defb43e82ac59d2193f10e2d00d784f488f4aa92ab93df3be97e0fde6504b2ae9d3ad4834de8cb704ce7973b6e282073f0d1613d61155ae084976b226d142"

RPROVIDES:${PN} += "libsqstdlib3.so.1001 \
libsquirrel1001 \
libsquirrel3.so.1001"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
