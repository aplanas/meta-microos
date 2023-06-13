SUMMARY = "Base library for ILM software (OpenEXR)"
DESCRIPTION = "Devel files for Imath, which is the base library for OpenEXR."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "3.1.6"

RPM_NAME = "Imath-devel-3.1.6-1.3.aarch64.rpm"
RPM_HASH = "6928a7b8e932f6d079587a28712279e8f659e6db5b22ffe3133e0d6cd50b5ca344b3211e06b9809c9eae643a48b4988505b08bffd9fd236135b67db125be3e37"

RPROVIDES:${PN} += "Imath-devel \
Imath-devel(aarch-64) \
cmake(Imath) \
pkgconfig(Imath)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libImath-3_1-29 \
libstdc++-devel"

inherit rpm
