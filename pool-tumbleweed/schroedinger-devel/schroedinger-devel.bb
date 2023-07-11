SUMMARY = "Library for decoding and encoding video in the Dirac format"
DESCRIPTION = "The Schroedinger project implements portable libraries for the high \
quality Dirac video codec created by BBC Research and Development. \
Dirac is a free and open source codec producing very high image quality \
video. The project produces two libraries in ANSI C89, one for decoding \
and one for encoding."
LICENSE = "GPL-2.0-only & LGPL-2.0-only & MPL-1.1 & MIT"

PV = "1.0.11"

RPM_NAME = "schroedinger-devel-1.0.11-11.18.aarch64.rpm"
RPM_HASH = "a0f868f49ac0654d70f831d7489bd6cb542a88a5b0c71f57367b68ba9e669491988a7a34a9548eaf418c003028d84e4a662f4e91f37ebada96dfacdab16ea95d"

RPROVIDES:${PN} += "libschroedinger-devel \
pkgconfig-schroedinger-1.0 \
schroedinger-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
libschroedinger-1-0-0 \
orc \
pkgconfig-orc-0.4"

inherit rpm
