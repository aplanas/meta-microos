SUMMARY = "Library for decoding and encoding video in the Dirac format"
DESCRIPTION = "The Schroedinger project implements portable libraries for the high \
quality Dirac video codec created by BBC Research and Development. \
Dirac is a free and open source codec producing very high image quality \
video. The project produces two libraries in ANSI C89, one for decoding \
and one for encoding."
LICENSE = "GPL-2.0-only & LGPL-2.0-only & MPL-1.1 & MIT"

PV = "1.0.11"

RPM_NAME = "schroedinger-doc-1.0.11-11.18.aarch64.rpm"
RPM_HASH = "bd489a673cb9ab83bb2e295e62a1aac2cdff5ea0fc7825f31265e85b1d46e1abaf8a371f2e9ed38e8e1a481e0078bfc776c0c6741183a203c28e2f0f75433fbf"

RPROVIDES:${PN} += "schroedinger-doc"

RDEPENDS:${PN} += "libschroedinger-1-0-0"

inherit rpm
