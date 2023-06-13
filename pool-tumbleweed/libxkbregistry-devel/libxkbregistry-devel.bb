SUMMARY = "Header files for xkbregistry"
DESCRIPTION = "libxkbregistry is a C library that lists available XKB models, \
layouts and variants for a given ruleset. \
 \
This is aimed at tools that provide a listing of available keyboard \
layouts to the user."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "libxkbregistry-devel-1.5.0-1.3.aarch64.rpm"
RPM_HASH = "b18f91d9560100be5d6592bde4873ca15f86a879b01fbda1ef4d2ecfb1f529d69f8acad96f5238942d97eb93bd7f6d894a2729aea5629361d9d56f6ebacb5377"

RPROVIDES:${PN} += "libxkbregistry-devel \
libxkbregistry-devel(aarch-64) \
pkgconfig(xkbregistry)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxkbregistry0 \
pkgconfig(libxml-2.0)"

inherit rpm
