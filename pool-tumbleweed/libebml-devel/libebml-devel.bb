SUMMARY = "Development files for the EBML file parser library"
DESCRIPTION = "libebml is a C++ library to parse EBML files. See the EBML RFC at \
http://www.matroska.org/technical/specs/rfc/index.html ."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.4"

RPM_NAME = "libebml-devel-1.4.4-1.4.aarch64.rpm"
RPM_HASH = "98fd9b9dbf7fa28ae34605bc7d48fad9d29f805a4fcf1558d359e7b737103ceec5f3494e9b350066dc7a8a91f2a583d7ff2e8571b93b436ca6bb737d4b42339c"

RPROVIDES:${PN} += "cmake-EBML \
libebml-devel \
pkgconfig-libebml"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libebml5 \
libstdc++-devel"

inherit rpm
