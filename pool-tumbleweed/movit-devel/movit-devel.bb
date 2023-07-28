SUMMARY = "Development files for the Movit GPU video filter library"
DESCRIPTION = "Movit is a library for video filters. It uses the GPU present in many \
computers to accelerate computation of common filters and \
transitions, facilitating real-time HD video editing. \
 \
This package contains the development files (library and header files)."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "movit-devel-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "ff115d3fb8702e42792103c3fee15c094b056e35607f2cd5b27e6c742927766dc406f1fab55f8576ab93cea1f728d5322613117e1a0d0c7911fe4177ad87943c"

RPROVIDES:${PN} += "movit-devel \
pkgconfig-movit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmovit8 \
pkgconfig-eigen3 \
pkgconfig-epoxy \
pkgconfig-fftw3"

inherit rpm
