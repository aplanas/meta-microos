SUMMARY = "Path searching library for TeX-related files"
DESCRIPTION = "Kpathsea is a library and utility programs which provide path \
searching facilities for TeX file types, including the self- \
locating feature required for movable installations, layered on \
top of a general search mechanism. It is not distributed \
separately, but rather is released and maintained as part of \
the TeX-live sources."
LICENSE = "LGPL-2.1-or-later"

PV = "6.3.5"

RPM_NAME = "libkpathsea6-6.3.5-93.2.aarch64.rpm"
RPM_HASH = "61d061f77d752084f32ac164327aaba03b40539f6add59faf58bf3e65a61315e6d64a4683f224ea796bac211bfff022c9a2f43b5b13c764a4232d096b877ff8c"

RPROVIDES:${PN} += "libkpathsea.so.6 \
libkpathsea6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
