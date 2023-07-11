SUMMARY = "Open Virtual Machine Tools - Development headers"
DESCRIPTION = "Those are the development headers for libvmtools. They are needed \
if you intend to create own plugins for vmtoolsd."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "12.2.0"

RPM_NAME = "libvmtools-devel-12.2.0-5.1.aarch64.rpm"
RPM_HASH = "28d53e9159db922cf1a19d26e99f8abac3c14fd40a1624c88dcd81987177dcb5df7578899f39d2aecfa40738e37abe130241e5cd946c5268d557489c5cee7be2"

RPROVIDES:${PN} += "libvmtools-devel \
pkgconfig-libDeployPkg \
pkgconfig-vmguestlib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvmtools0"

inherit rpm
