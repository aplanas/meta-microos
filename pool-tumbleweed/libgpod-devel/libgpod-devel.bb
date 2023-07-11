SUMMARY = "Development files for libgpod"
DESCRIPTION = "libgpod is a library meant to abstract access to iPod content. It \
provides an API to retrieve the list of files and \
playlists stored on an iPod, modify them, and save them back to the iPod. \
 \
This package provides the development files to use libgpod."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libgpod-devel-0.8.3-12.7.aarch64.rpm"
RPM_HASH = "56245d8ef69d2b6ee9c62d302fbe0c26bef642a1dfc18edc4fc3e0c04d4356d37d3fbc38a16aa859f7b36ecf448ac386d252fa47aad412edbd0991c330334207"

RPROVIDES:${PN} += "libgpod-devel \
pkgconfig-libgpod-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
glibc-devel \
libgpod4 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libimobiledevice-1.0"

inherit rpm
