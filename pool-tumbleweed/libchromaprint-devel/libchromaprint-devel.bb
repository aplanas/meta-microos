SUMMARY = "Audio Fingerprinting Library"
DESCRIPTION = "Chromaprint is the core component of the Acoustid project. It's a client-side \
library that implements a custom algorithm for extracting fingerprints from any \
audio source."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.1"

RPM_NAME = "libchromaprint-devel-1.5.1-4.2.aarch64.rpm"
RPM_HASH = "398a3da38e6fd27f43a59c7aa8c88d945b0f64d7c587e584d8219c1af4bb18fa3c0317edeb911d43c63f45188e246be394b6bd17fe4d0e69e2803ea8bf065478"

RPROVIDES:${PN} += "libchromaprint-devel \
pkgconfig-libchromaprint"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
fftw3-devel \
libchromaprint1 \
libtag-devel"

inherit rpm
