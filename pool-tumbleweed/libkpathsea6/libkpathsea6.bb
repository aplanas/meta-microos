SUMMARY = "Path searching library for TeX-related files"
DESCRIPTION = "Kpathsea is a library and utility programs which provide path \
searching facilities for TeX file types, including the self- \
locating feature required for movable installations, layered on \
top of a general search mechanism. It is not distributed \
separately, but rather is released and maintained as part of \
the TeX-live sources."
LICENSE = "LGPL-2.1-or-later"

PV = "6.3.5"

RPM_NAME = "libkpathsea6-6.3.5-92.1.aarch64.rpm"
RPM_HASH = "bb49c45e4d2a9adc4a4ed8a6609c2f8617536c16e8b94a71282b01e2a8367901690910abb37f3f705729283208136ceb65aea857f09725f21ff64beeb3b57b24"

RPROVIDES:${PN} += "libkpathsea.so.6 \
libkpathsea6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
