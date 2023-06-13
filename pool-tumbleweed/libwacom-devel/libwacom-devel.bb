SUMMARY = "Library to identify wacom tablets -- Development Files"
DESCRIPTION = "libwacom is a library to identify wacom tablets and their model-specific \
features. It provides easy access to information such as 'is this a \
built-in on-screen tablet', 'what is the size of this model', etc."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "libwacom-devel-2.5.0-1.3.aarch64.rpm"
RPM_HASH = "714a058d02d985d64663bf58eded9d0534e67c3489bb66dae8fb66185bf4e4fc9b64973f6ac04a2e6c8e80fba16faa99aeb24ff16c411cb2002944066121f30f"

RPROVIDES:${PN} += "libwacom-devel \
libwacom-devel(aarch-64) \
pkgconfig(libwacom)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwacom9 \
pkgconfig(glib-2.0) \
pkgconfig(gudev-1.0)"

inherit rpm
