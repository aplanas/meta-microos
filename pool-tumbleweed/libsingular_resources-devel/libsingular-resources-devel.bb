SUMMARY = "Development files for Singular's 'Singular' library"
DESCRIPTION = "(Upstream has not provided any description.)"
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.3.1.p3"

RPM_NAME = "libsingular_resources-devel-4.3.1.p3-1.4.aarch64.rpm"
RPM_HASH = "6f2bbd4a461c4d0d207650fa0f03722f73858273c076c5272a22c94b0d74fda3a1b9c7cf2ad455a2318af67ff5dc78a2acacc800b55b9c9e436cd4179a12add3"

RPROVIDES:${PN} += "libsingular-resources-devel \
pkgconfig-singular-resources"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsingular-resources-4-3-1"

inherit rpm
