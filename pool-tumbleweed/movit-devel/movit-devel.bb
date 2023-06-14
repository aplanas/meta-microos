SUMMARY = "Development files for the Movit GPU video filter library"
DESCRIPTION = "Movit is a library for video filters. It uses the GPU present in many \
computers to accelerate computation of common filters and \
transitions, facilitating real-time HD video editing. \
 \
This package contains the development files (library and header files)."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.3"

RPM_NAME = "movit-devel-1.6.3-1.15.aarch64.rpm"
RPM_HASH = "7fd50c8606014d85041893cbce2f9032da7fd68519206f391ddd9eeff7ccf55d14e1347f526fcba6ea4b65ed3fb85b4ccbe8ac97f0e8bf761b1ea9dab214c298"

RPROVIDES:${PN} += "movit-devel \
pkgconfig-movit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmovit8 \
pkgconfig-eigen3 \
pkgconfig-epoxy \
pkgconfig-fftw3"

inherit rpm
