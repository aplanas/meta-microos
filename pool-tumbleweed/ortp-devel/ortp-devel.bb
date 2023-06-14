SUMMARY = "Headers, libraries and docs for the oRTP library"
DESCRIPTION = "oRTP is a C library implementing the RTP protocol (RFC 1889). \
 \
This package contains header files and development libraries needed to \
develop programs using the oRTP library."
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.49"

RPM_NAME = "ortp-devel-5.2.49-1.1.aarch64.rpm"
RPM_HASH = "2fa5d5250152ccdd6fe8cf68fa1f0c6e6271f7088ee1bdfa726175444dacab458d9a3dc6d096dab613bb38d422e4492c2e60112d1c108d37490449ef9496d1b5"

RPROVIDES:${PN} += "cmake-ortp \
libortp-devel \
ortp-devel \
pkgconfig-ortp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake \
libortp15 \
pkgconfig-bctoolbox"

inherit rpm
