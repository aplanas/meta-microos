SUMMARY = "Libraries of Kanji code convert library for pTeX"
DESCRIPTION = "This package includes the ptexenc development files. \
The ptexenc is a useful library for Japanese pTeX \
(which stands for publishing TeX, and is an extension of \
TeX by ASCII Co.) and its surrounding tools."
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "texlive-ptexenc-devel-1.4.3-93.2.aarch64.rpm"
RPM_HASH = "4236fab71c6e12a9460a0ca4ae30abdb63783d2f2cc5cd073d43456510c407788a7869728ff7af9426b7b84d1b095f07c5a0bbaaaf4c382d6a003e18dfaaa746"

RPROVIDES:${PN} += "pkgconfig-ptexenc \
texlive-ptexenc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libptexenc1 \
pkgconfig-kpathsea"

inherit rpm
