SUMMARY = "Path searching library for TeX-related files"
DESCRIPTION = "Kpathsea is a library and utility programs which provide path \
searching facilities for TeX file types, including the self- \
locating feature required for movable installations, layered on \
top of a general search mechanism. It is not distributed \
separately, but rather is released and maintained as part of \
the TeX-live sources."
LICENSE = "LGPL-2.1-or-later"

PV = "6.3.5"

RPM_NAME = "texlive-kpathsea-devel-6.3.5-93.1.aarch64.rpm"
RPM_HASH = "b29fae2fe668ae5c221419d56bcc35ffbbdedefb03ccf4e401948063f819b4844864c4159eec119337c84711bc8ee7c7d0e2bb36948e676524dcd61c4cf98778"

RPROVIDES:${PN} += "pkgconfig-kpathsea \
texlive-kpathsea-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libkpathsea6"

inherit rpm
