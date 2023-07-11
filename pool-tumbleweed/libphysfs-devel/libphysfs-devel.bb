SUMMARY = "Libraries, includes and more to develop PhysicsFS applications"
DESCRIPTION = "Development package for libphysfs, a library to provide abstract access to \
various archives."
LICENSE = "(CPL-1.0 | LGPL-2.1-or-later) & Zlib"

PV = "3.2.0"

RPM_NAME = "libphysfs-devel-3.2.0-1.4.aarch64.rpm"
RPM_HASH = "4c4cd024e9efb4fb1ecc9f7d2a9e303a6925a751f3807121a31839bf509901bb6abb6c9a86a891839136e0d1f0fc22bf40aebb5fc91299b6f4fa6b921754774d"

RPROVIDES:${PN} += "cmake-PhysFS \
libphysfs-devel \
physfs-devel \
pkgconfig-physfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libphysfs1"

inherit rpm
