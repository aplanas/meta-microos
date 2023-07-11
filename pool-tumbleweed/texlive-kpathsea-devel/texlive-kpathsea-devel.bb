SUMMARY = "Path searching library for TeX-related files"
DESCRIPTION = "Kpathsea is a library and utility programs which provide path \
searching facilities for TeX file types, including the self- \
locating feature required for movable installations, layered on \
top of a general search mechanism. It is not distributed \
separately, but rather is released and maintained as part of \
the TeX-live sources."
LICENSE = "LGPL-2.1-or-later"

PV = "6.3.5"

RPM_NAME = "texlive-kpathsea-devel-6.3.5-92.1.aarch64.rpm"
RPM_HASH = "892c7f48167300d9f0a610ed28b94c8ea94c7d81de6e564cd63f8686a5c5e7f02fbfd9b5ebe63cb21088dcd1727d85a9d6697df5f270e3dab27add578af2d35e"

RPROVIDES:${PN} += "pkgconfig-kpathsea \
texlive-kpathsea-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libkpathsea6"

inherit rpm
