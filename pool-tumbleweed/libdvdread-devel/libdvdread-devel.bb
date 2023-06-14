SUMMARY = "Development Environment for libdvdread"
DESCRIPTION = "This package contains the include-files and static libraries for \
libdvdread."
LICENSE = "GPL-2.0-or-later"

PV = "6.1.3"

RPM_NAME = "libdvdread-devel-6.1.3-1.4.aarch64.rpm"
RPM_HASH = "754fecd56213e411dfffceb81445d49da59af3340855510d27fb7a77fa8f0cf1c0b4eb2d53579a03ca515503479cc0096788bef6b9cb5b13eccfb179a1b68279"

RPROVIDES:${PN} += "libdvdread-devel \
pkgconfig-dvdread"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libdvdread8"

inherit rpm
