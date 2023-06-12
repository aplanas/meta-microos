SUMMARY = "Development files for wavpack, an audio compression format"
DESCRIPTION = "WavPack is an open audio compression format providing lossless, high-quality \
lossy, and unique hybrid compression modes. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of wavpack."
LICENSE = "BSD-3-Clause"

PV = "5.6.0"

RPM_NAME = "wavpack-devel-5.6.0-1.3.aarch64.rpm"
RPM_HASH = "14fb8a1f74a37f5d07e95c938bb3754eb6f98de3279f51816e33e602422cf695660ff475a4cd3ea5abac526477481ea72b0f90bb70d2d3ffcafb7495e9fdd159"

RPROVIDES:${PN} += "pkgconfig(wavpack) \
wavpack-devel \
wavpack-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
wavpack"

inherit rpm
