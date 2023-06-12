SUMMARY = "Static Libraries for the FOX Toolkit 1.6"
DESCRIPTION = "This package contains static libraries for developing applications \
which are statically linked against the FOX libraries. \
 \
FOX is a C++-based library for graphical user interface development."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.57"

RPM_NAME = "fox16-devel-static-1.6.57-4.1.aarch64.rpm"
RPM_HASH = "43f0d2e2e3662619fbb84a55b7e3d697dc558ae166e2234b616d10107392fc3df053d8ef4ea8cfdd2e635bb69f8e15b622a6176ea1655a6f4435e7ae1f7f3bc9"

RPROVIDES:${PN} += "fox16-devel-static \
fox16-devel-static(aarch-64) \
fox16-static"
RDEPENDS:${PN} += "fox16-devel"

inherit rpm
