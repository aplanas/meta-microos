SUMMARY = "Path searching library for TeX-related files"
DESCRIPTION = "Kpathsea is a library and utility programs which provide path \
searching facilities for TeX file types, including the self- \
locating feature required for movable installations, layered on \
top of a general search mechanism. It is not distributed \
separately, but rather is released and maintained as part of \
the TeX-live sources."
LICENSE = "LGPL-2.1-or-later"

PV = "6.3.5"

RPM_NAME = "libkpathsea6-6.3.5-91.1.aarch64.rpm"
RPM_HASH = "85c358d078ad027582e063ebba15126528edf650af8c04a981655e632b937874a0b6e3a52b4e4304bd5ccd5fea5c4c57e0491f26f5a1f794e58484d4db99e78c"

RPROVIDES:${PN} += "libkpathsea.so.6()(64bit) \
libkpathsea6 \
libkpathsea6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
