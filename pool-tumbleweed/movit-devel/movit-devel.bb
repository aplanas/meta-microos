SUMMARY = "Development files for the Movit GPU video filter library"
DESCRIPTION = "Movit is a library for video filters. It uses the GPU present in many \
computers to accelerate computation of common filters and \
transitions, facilitating real-time HD video editing. \
 \
This package contains the development files (library and header files)."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.1"

RPM_NAME = "movit-devel-1.7.1-1.1.aarch64.rpm"
RPM_HASH = "557b267dd942ea99bc072850ff762ba63cc486464961bbf2e8928d44d654ddc42de2400c03265cb177f083c4747925f88d16419cdd8f678742df9671e897ee13"

RPROVIDES:${PN} += "movit-devel \
pkgconfig-movit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmovit8 \
pkgconfig-eigen3 \
pkgconfig-epoxy \
pkgconfig-fftw3"

inherit rpm
