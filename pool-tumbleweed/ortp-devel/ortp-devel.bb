SUMMARY = "Headers, libraries and docs for the oRTP library"
DESCRIPTION = "oRTP is a C library implementing the RTP protocol (RFC 1889). \
 \
This package contains header files and development libraries needed to \
develop programs using the oRTP library."
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.73"

RPM_NAME = "ortp-devel-5.2.73-1.1.aarch64.rpm"
RPM_HASH = "6a4052ed53c764d94b150e6c4275c591f4bb8337584ee67357076b4bd594a3869b8bd39aa2dc781ed67504af5d96870610b6e8b4481a8ff0e932a960ff2e214d"

RPROVIDES:${PN} += "cmake-ortp \
libortp-devel \
ortp-devel \
pkgconfig-ortp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake \
libortp15 \
pkgconfig-bctoolbox"

inherit rpm
