SUMMARY = "Opus Audio Codec Library Development Environment"
DESCRIPTION = "The Opus codec is designed for interactive speech and audio transmission over \
the Internet. It is designed by the IETF Codec Working Group and incorporates \
technology from Skype's SILK codec and Xiph.Org's CELT codec."
LICENSE = "BSD-3-Clause"

PV = "1.4"

RPM_NAME = "libopus-devel-1.4-1.2.aarch64.rpm"
RPM_HASH = "2264457889939c358ad3923acde7e0fd8dbb8fea98b81910d1de747892e02d041680e337ad1a3ed73015edb462751db47b3afdbdb44415e42dafb5918942a254"

RPROVIDES:${PN} += "libopus-devel \
pkgconfig-opus"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopus0"

inherit rpm
