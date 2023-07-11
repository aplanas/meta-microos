SUMMARY = "Development package for FUSE (userspace filesystem) modules"
DESCRIPTION = "This package contains the static library variants of libfuse."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.9.9"

RPM_NAME = "fuse-devel-static-2.9.9-6.4.aarch64.rpm"
RPM_HASH = "2e9ab341001a617c1000b7d2e03818687d6fa187b957b0543b3e5076eec6aa8d9d11638577a28092c2a12229719aecf89bb50c4e7901ade47f3036f6d70b13c2"

RPROVIDES:${PN} += "fuse-devel-/usr/lib64/libfuse.a \
fuse-devel-static"

RDEPENDS:${PN} += "fuse-devel"

inherit rpm
