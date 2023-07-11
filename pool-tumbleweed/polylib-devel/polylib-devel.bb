SUMMARY = "Development files for PolyLib"
DESCRIPTION = "The Polyhedral Library (PolyLib) operates on objects made up of \
unions of polyhedra of any dimension. \
 \
It can manipulate non-parameterized unions of polyhedra \
(intersection, difference, union, convex hull, simplify, image and \
preimage, plus some input and output functions), parameterized \
vertices computation, and Ehrhart polynomials computation. \
 \
This subpackage contains the include files and library links for \
developing with PolyLib."
LICENSE = "GPL-3.0-or-later"

PV = "5.22.5"

RPM_NAME = "polylib-devel-5.22.5-2.1.aarch64.rpm"
RPM_HASH = "bf6811a1295b690167500c4f9bf9fcf97fc6a8260823d9700c99bb0f89409117bb113eabe6424a151b9f76715df3b3f41cff7144b5ccb59301f9f7844b3ab6c6"

RPROVIDES:${PN} += "pkgconfig-polylibgmp \
polylib-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpolylibgmp8 \
pkgconfig-gmp"

inherit rpm
