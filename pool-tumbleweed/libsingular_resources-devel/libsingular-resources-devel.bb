SUMMARY = "Development files for Singular's 'Singular' library"
DESCRIPTION = "(Upstream has not provided any description.)"
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.3.1.p3"

RPM_NAME = "libsingular_resources-devel-4.3.1.p3-1.3.aarch64.rpm"
RPM_HASH = "c7519571b600f0e765893519dd2e47fad9c9ce810f4dc7dbead3b112b4e946688cb28427f0f1c0dc5cc65ec81a62aee434d0f059fac9577015b0bc6bf7cc309a"

RPROVIDES:${PN} += "libsingular-resources-devel \
pkgconfig-singular-resources"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsingular-resources-4-3-1"

inherit rpm
