SUMMARY = "Open Virtual Machine Tools - Development headers"
DESCRIPTION = "Those are the development headers for libvmtools. They are needed \
if you intend to create own plugins for vmtoolsd."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "12.2.0"

RPM_NAME = "libvmtools-devel-12.2.0-5.2.aarch64.rpm"
RPM_HASH = "564b498d62e8cbe2f252ed8b8f6ffa8d278dc19d0668942a3635b5165696800e4dc3a3b65c394b794a1f747fa8f41d454bcac1e55dcf236347587f5c40aef714"

RPROVIDES:${PN} += "libvmtools-devel \
pkgconfig-libDeployPkg \
pkgconfig-vmguestlib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvmtools0"

inherit rpm
