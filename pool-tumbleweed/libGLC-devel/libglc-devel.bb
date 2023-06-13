SUMMARY = "QuesoGLC Development Files"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications using QuesoGLC."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "libGLC-devel-0.7.2-3.6.aarch64.rpm"
RPM_HASH = "4593c317ea03e3d2ac0e2395c9562ce9c0f881f88fa43a58668c7fed8a068ecace6850839afb689b3bccfd2b3fd26053537f9e1b30855f19997dd26a41866c07"

RPROVIDES:${PN} += "libGLC-devel \
libGLC-devel(aarch-64) \
pkgconfig(quesoglc)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-devel \
libGLC0 \
pkgconfig(expat) \
pkgconfig(fontconfig) \
pkgconfig(freetype2) \
pkgconfig(fribidi) \
pkgconfig(zlib)"

inherit rpm
