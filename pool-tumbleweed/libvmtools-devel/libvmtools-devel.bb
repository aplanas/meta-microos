SUMMARY = "Open Virtual Machine Tools - Development headers"
DESCRIPTION = "Those are the development headers for libvmtools. They are needed \
if you intend to create own plugins for vmtoolsd."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "12.3.0"

RPM_NAME = "libvmtools-devel-12.3.0-1.1.aarch64.rpm"
RPM_HASH = "a6b192c8d44ff99655e99174f345c3cd94a91bbba6b25704331de19bd55c342db50f5a4befc1f136d2cc2fa6169dd5e571332042efc548a36b33d04fca6a0c04"

RPROVIDES:${PN} += "libvmtools-devel \
pkgconfig-libDeployPkg \
pkgconfig-vmguestlib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvmtools0"

inherit rpm
