SUMMARY = "Shell search provider for GNOME Boxes"
DESCRIPTION = "Boxes is an application to create, setup, access, and use: remote \
machines, remote and local virtual machines, and, when technology permits, \
applications on local virtual machines. \
 \
This package contains a search provider to enable GNOME Shell to get \
search results from Boxes."
LICENSE = "LGPL-2.0-or-later"

PV = "44.2"

RPM_NAME = "gnome-shell-search-provider-boxes-44.2-1.1.aarch64.rpm"
RPM_HASH = "b4f55662ae115c64f0e2df712c9af305b753122245159fdeb435764c648ef06160151c32361590596e456dd5ef3c407cd6cfd755549923abaf2fd4066e17808f"

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
