SUMMARY = "Libraries of Kanji code convert library for pTeX"
DESCRIPTION = "This package includes the ptexenc development files. \
The ptexenc is a useful library for Japanese pTeX \
(which stands for publishing TeX, and is an extension of \
TeX by ASCII Co.) and its surrounding tools."
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "texlive-ptexenc-devel-1.4.3-93.1.aarch64.rpm"
RPM_HASH = "cf63d201959dca827198a94addd33782bb555a55d1a84c36802026b213b2262c5968b25844d798d27b2cc115ee338157ba993302b1906c7f9aa4b2958a4f379d"

RPROVIDES:${PN} += "pkgconfig-ptexenc \
texlive-ptexenc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libptexenc1 \
pkgconfig-kpathsea"

inherit rpm
