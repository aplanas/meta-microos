SUMMARY = "Development files for glusterfs"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes. \
 \
This package provides development files such as headers and library \
links."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.0"

RPM_NAME = "glusterfs-devel-11.0-2.1.aarch64.rpm"
RPM_HASH = "a95a37d9d92df4229b168583fc15195754ed3c1eae8625c43d474b42cd7ec94b227045bcf6edd1077c7245f836667976ef4eeff0512548e029decf5c3b9b0c0b"

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
