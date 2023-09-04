SUMMARY = "Include Files and Libraries for Development with the GNU MP Library"
DESCRIPTION = "These libraries are needed to develop programs which calculate with \
huge numbers (integer and floating point)."
LICENSE = "(GPL-2.0-or-later | LGPL-3.0-or-later) & GPL-3.0-or-later"

PV = "6.3.0"

RPM_NAME = "gmp-devel-6.3.0-1.1.aarch64.rpm"
RPM_HASH = "8e217267b58af93d9c1b59dcd131cf29c7dd69c44a5e07e4c17572c7a6ac93b2269769a1929863cd571144c4c8aa1f46e4ed4db51c4b284c002fedda804e4688"

RPROVIDES:${PN} += "gmp-devel \
pkgconfig-gmp \
pkgconfig-gmpxx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libgmp10 \
libgmpxx4 \
pkgconfig-gmp"

inherit rpm
