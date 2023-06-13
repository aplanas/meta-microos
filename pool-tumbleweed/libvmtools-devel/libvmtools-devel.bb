SUMMARY = "Open Virtual Machine Tools - Development headers"
DESCRIPTION = "Those are the development headers for libvmtools. They are needed \
if you intend to create own plugins for vmtoolsd."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "12.2.0"

RPM_NAME = "libvmtools-devel-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "d8e2443c8cfe520702544e06e0e58142e1f436c037f8a3366a91250f82432aec6279cb2abc72576274d92f4713a1963f74190a761b46f74054c9621489489626"

RPROVIDES:${PN} += "libvmtools-devel \
libvmtools-devel(aarch-64) \
pkgconfig(libDeployPkg) \
pkgconfig(vmguestlib)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvmtools0"

inherit rpm
