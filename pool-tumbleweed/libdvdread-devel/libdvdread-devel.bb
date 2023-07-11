SUMMARY = "Development Environment for libdvdread"
DESCRIPTION = "This package contains the include-files and static libraries for \
libdvdread."
LICENSE = "GPL-2.0-or-later"

PV = "6.1.3"

RPM_NAME = "libdvdread-devel-6.1.3-1.5.aarch64.rpm"
RPM_HASH = "a49166d94b6b0e073010442c3ad283e08ef3c80d4f485eba37279e5a08746fb3aaf44748c76b7c71c81bf349dc5da9e95e662eacc3e3e5ce9c6feb061b4de6e0"

RPROVIDES:${PN} += "libdvdread-devel \
pkgconfig-dvdread"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libdvdread8"

inherit rpm
