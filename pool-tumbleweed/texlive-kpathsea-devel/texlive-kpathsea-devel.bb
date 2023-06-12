SUMMARY = "Path searching library for TeX-related files"
DESCRIPTION = "Kpathsea is a library and utility programs which provide path \
searching facilities for TeX file types, including the self- \
locating feature required for movable installations, layered on \
top of a general search mechanism. It is not distributed \
separately, but rather is released and maintained as part of \
the TeX-live sources."
LICENSE = "LGPL-2.1-or-later"

PV = "6.3.5"

RPM_NAME = "texlive-kpathsea-devel-6.3.5-91.1.aarch64.rpm"
RPM_HASH = "960325b98a403dddc4f8947348e0c23bc8477968970be4e00158f1494ea8690548b07bdc4174ddccee7a038514bb8edb8fef6664b395979de94549fcbd3c75bf"

RPROVIDES:${PN} += "pkgconfig(kpathsea) \
texlive-kpathsea-devel \
texlive-kpathsea-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libkpathsea6"

inherit rpm
