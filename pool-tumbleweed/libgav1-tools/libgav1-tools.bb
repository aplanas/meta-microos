SUMMARY = "AV1 video decoder — Command line utility"
DESCRIPTION = "libgav1 is a Main profile (0) & High profile (1) compliant AV1 decoder written \
in C++ and also offering a C API. \
 \
This package contains the gav1_decode commandline program."
LICENSE = "Apache-2.0"

PV = "0.18.0"

RPM_NAME = "libgav1-tools-0.18.0-2.2.aarch64.rpm"
RPM_HASH = "afc9169091737032b8f687135eb84c32bf1e04458d68818a7a540f358b3899294c4101e546ab3e14d220db2a42882cb8b1a92c6b07f90e72aa6f03b512a99673"

RPROVIDES:${PN} += "libgav1-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libabsl-strings.so.2308.0.0 \
libabsl-time.so.2308.0.0 \
libc.so.6 \
libgav1.so.1 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
