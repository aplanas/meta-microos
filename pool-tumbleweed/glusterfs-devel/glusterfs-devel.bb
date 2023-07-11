SUMMARY = "Development files for glusterfs"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes. \
 \
This package provides development files such as headers and library \
links."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.0"

RPM_NAME = "glusterfs-devel-11.0-3.1.aarch64.rpm"
RPM_HASH = "30f72cfb7f4e917dec427e3ac47646de45b68874ac247eaf5177c31a45213f84342f3979d0e4e0143746e55dca00b24033fb6d93ea8d2fb28d6b4eb36dd4bb9a"

RPROVIDES:${PN} += "glusterfs-devel \
pkgconfig-glusterfs-api \
pkgconfig-libgfchangelog"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glusterfs \
libacl-devel \
libgfapi0 \
libgfchangelog0 \
libgfrpc0 \
libgfxdr0 \
libglusterfs0 \
pkgconfig-uuid"

inherit rpm
