SUMMARY = "Headers etc. for finch Stuffs"
DESCRIPTION = "The finch-devel package contains the header files, developer \
documentation, and libraries required for development of Finch \
scripts and plugins."
LICENSE = "GPL-2.0-only"

PV = "2.14.12"

RPM_NAME = "finch-devel-2.14.12-1.4.aarch64.rpm"
RPM_HASH = "da84215a9e0aa0aa325d6f1f35d369c5404b57a86d08b5d6064f44546bc46629e5c654516d0ad644f911e42e9bf16b3272d57ff7c15da25ae9d2d4739e33df3d"

RPROVIDES:${PN} += "finch-devel \
pkgconfig-finch"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
finch \
glibc-devel \
libpurple-devel \
ncurses-devel \
pkgconfig-glib-2.0 \
pkgconfig-gnt \
pkgconfig-purple"

inherit rpm
