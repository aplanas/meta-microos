SUMMARY = "Wireless setup and cryptography library"
DESCRIPTION = "The 'Embedded Linux Library' implements an API for wireless \
cryptography actions by using the kernel crypto API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56"

RPM_NAME = "libell0-0.56-1.3.aarch64.rpm"
RPM_HASH = "a881853122a159d0b54dd0628d774834b82bbf3109e1197af2c96fa4cdf4e771c6098816f56ed49b6b0e6ac835854df9fa71e1fba475a1eb92e7bca8f6ec0ee7"

RPROVIDES:${PN} += "libell.so.0()(64bit) \
libell.so.0(ELL_0.56)(64bit) \
libell0 \
libell0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
