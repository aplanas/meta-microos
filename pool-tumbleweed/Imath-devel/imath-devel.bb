SUMMARY = "Base library for ILM software (OpenEXR)"
DESCRIPTION = "Devel files for Imath, which is the base library for OpenEXR."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "3.1.9"

RPM_NAME = "Imath-devel-3.1.9-1.1.aarch64.rpm"
RPM_HASH = "cba63b13aa501c47fd3a417b5f66ca4d83b293374a6dc28469a998e3228a31a9bd69c86822399a032954117978b7fa49ce4c5689f76ecfbced5df6e1d3ce9d55"

RPROVIDES:${PN} += "Imath-devel \
cmake-Imath \
pkgconfig-Imath"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libImath-3-1-29 \
libstdc++-devel"

inherit rpm
