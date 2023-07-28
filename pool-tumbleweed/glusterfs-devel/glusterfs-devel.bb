SUMMARY = "Development files for glusterfs"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes. \
 \
This package provides development files such as headers and library \
links."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.0"

RPM_NAME = "glusterfs-devel-11.0-4.1.aarch64.rpm"
RPM_HASH = "ae21af7f6de6239d56fe5a17c05e519616ee14bac3e56eff0535f8512110b7b6bf337443cf3e63e09e421636cd77c57efd4df3d6b07648e56203c35c57a4fa00"

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
