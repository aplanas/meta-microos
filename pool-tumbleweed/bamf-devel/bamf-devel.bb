SUMMARY = "Development files for the BAMF window matching library"
DESCRIPTION = "bamf matches application windows to desktop files. \
 \
This package contains files that are needed to build applications."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "0.5.6"

RPM_NAME = "bamf-devel-0.5.6-1.5.aarch64.rpm"
RPM_HASH = "cd63bd5734fc5cb4e57af9680295058bf2e37d7d834e164bb5bd939644a6676fbb89dbbce493294d6ff4ff594294bc12b903e4d98db2da3b9cba07cc650b2815"

RPROVIDES:${PN} += "bamf-devel \
pkgconfig-libbamf3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbamf3-2 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
typelib-1-0-Bamf-3-0"

inherit rpm
