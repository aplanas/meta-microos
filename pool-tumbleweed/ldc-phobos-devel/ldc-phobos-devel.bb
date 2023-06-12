SUMMARY = "Development files for the D standard library"
DESCRIPTION = "This package contains the Phobos development files necessary for developing \
with LDC."
LICENSE = "Artistic-1.0 & BSD-3-Clause"

PV = "1.32.0"

RPM_NAME = "ldc-phobos-devel-1.32.0-1.1.aarch64.rpm"
RPM_HASH = "f47b467082ca85d0fa817e0f7f7208b17c570f2b0cbd248e9f3dc1ade9c43bfa2030369dc209d90be941bd6f5f778b7dacaf73364a723c89232fbea434128f3d"

RPROVIDES:${PN} += "ldc-phobos-devel \
ldc-phobos-devel(aarch-64)"
RDEPENDS:${PN} += "ldc-runtime-devel \
libphobos2-ldc102"

inherit rpm
