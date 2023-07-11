SUMMARY = "VDE hist header files"
DESCRIPTION = "This package contains VDE hist header files"
LICENSE = "GPL-2.0"

PV = "2.3.2+svn587"

RPM_NAME = "libvdehist-devel-2.3.2+svn587-3.24.aarch64.rpm"
RPM_HASH = "754dbe74a3347b3e2efffd0db22fd40f47172c944e63fbb53c1e988b2acf5557da87e22ee11cc15976280e6ec788957b80a4c5f87fdf5c9aa8c7906f13991cf1"

RPROVIDES:${PN} += "libvdehist-devel \
libvdehist0-devel \
pkgconfig-vdehist"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvdehist0 \
vde2"

inherit rpm
