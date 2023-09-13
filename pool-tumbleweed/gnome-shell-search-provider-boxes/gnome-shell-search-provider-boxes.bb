SUMMARY = "Shell search provider for GNOME Boxes"
DESCRIPTION = "Boxes is an application to create, setup, access, and use: remote \
machines, remote and local virtual machines, and, when technology permits, \
applications on local virtual machines. \
 \
This package contains a search provider to enable GNOME Shell to get \
search results from Boxes."
LICENSE = "LGPL-2.0-or-later"

PV = "44.3"

RPM_NAME = "gnome-shell-search-provider-boxes-44.3-1.1.aarch64.rpm"
RPM_HASH = "c3570af433a0b02f033f88c813a7f254e969c622aa3b7b2ff6ae6f7e92b5ba18e05e39f2899853732e06399b4abf7b8bf27a87fcf3b525fdbbbc2affd951329b"

RPROVIDES:${PN} += "gnome-shell-search-provider-boxes"

RDEPENDS:${PN} += "gnome-boxes \
gnome-shell \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
