SUMMARY = "Path searching library for TeX-related files"
DESCRIPTION = "Kpathsea is a library and utility programs which provide path \
searching facilities for TeX file types, including the self- \
locating feature required for movable installations, layered on \
top of a general search mechanism. It is not distributed \
separately, but rather is released and maintained as part of \
the TeX-live sources."
LICENSE = "LGPL-2.1-or-later"

PV = "6.3.5"

RPM_NAME = "texlive-kpathsea-devel-6.3.5-93.2.aarch64.rpm"
RPM_HASH = "32ce6371463c8612da54231586e249e4cb5bb558026dc522cf235bf77c58f6f6a640b9abe848af3a352045e881b86bd6f96aa89b08e72fd821af8a53960b4278"

RPROVIDES:${PN} += "pkgconfig-kpathsea \
texlive-kpathsea-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libkpathsea6"

inherit rpm
