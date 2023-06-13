SUMMARY = "Shell search provider for GNOME Boxes"
DESCRIPTION = "Boxes is an application to create, setup, access, and use: remote \
machines, remote and local virtual machines, and, when technology permits, \
applications on local virtual machines. \
 \
This package contains a search provider to enable GNOME Shell to get \
search results from Boxes."
LICENSE = "LGPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gnome-shell-search-provider-boxes-44.1-1.1.aarch64.rpm"
RPM_HASH = "43fd6f38762be91291936a81b5038ba7d5636e9b8de6f0a1c7c9f3e0466825e03788af1d717b21afc3600f2b658133d1b3f97b1b6ed39620c53a14f2e0e95612"

RPROVIDES:${PN} += "gnome-shell-search-provider-boxes \
gnome-shell-search-provider-boxes(aarch-64)"

RDEPENDS:${PN} += "gnome-boxes \
gnome-shell \
ld-linux-aarch64.so.1()(64bit) \
libarchive.so.13()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
