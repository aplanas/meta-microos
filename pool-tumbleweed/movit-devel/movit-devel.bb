SUMMARY = "Development files for the Movit GPU video filter library"
DESCRIPTION = "Movit is a library for video filters. It uses the GPU present in many \
computers to accelerate computation of common filters and \
transitions, facilitating real-time HD video editing. \
 \
This package contains the development files (library and header files)."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.3"

RPM_NAME = "movit-devel-1.6.3-1.16.aarch64.rpm"
RPM_HASH = "47b6884d8943e9215c5dd3a5db9f6ce09ee2ed249a37ae3516db30885ff123cfedf551bf2fb4d588af434ccd7a92ffd29bb62293c2b34cc5aebbe3c9b32b4879"

RPROVIDES:${PN} += "movit-devel \
pkgconfig-movit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmovit8 \
pkgconfig-eigen3 \
pkgconfig-epoxy \
pkgconfig-fftw3"

inherit rpm
