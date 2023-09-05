SUMMARY = "Open Virtual Machine Tools - Development headers"
DESCRIPTION = "Those are the development headers for libvmtools. They are needed \
if you intend to create own plugins for vmtoolsd."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "12.2.0"

RPM_NAME = "libvmtools-devel-12.2.0-6.1.aarch64.rpm"
RPM_HASH = "d862c4a68a326000af185a90f30518043d42540ea18135d6abb0de62bfb4871f3667701d75985da34304287646a2b337600e50f22d6ff2e9c2375731815fa30f"

RPROVIDES:${PN} += "libvmtools-devel \
pkgconfig-libDeployPkg \
pkgconfig-vmguestlib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvmtools0"

inherit rpm
