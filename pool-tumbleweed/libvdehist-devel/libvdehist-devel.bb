SUMMARY = "VDE hist header files"
DESCRIPTION = "This package contains VDE hist header files"
LICENSE = "GPL-2.0"

PV = "2.3.2+svn587"

RPM_NAME = "libvdehist-devel-2.3.2+svn587-3.23.aarch64.rpm"
RPM_HASH = "82f8e8b7feb94eecd0d508f2afbf9a3a6ca585a76f48ace861a05cac7e02153754c3dfc09e27b9e55117d106a0b0b314320b7245a3c64344721d245ab2ec5786"

RPROVIDES:${PN} += "libvdehist-devel \
libvdehist0-devel \
pkgconfig-vdehist"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvdehist0 \
vde2"

inherit rpm
