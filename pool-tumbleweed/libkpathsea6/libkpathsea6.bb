SUMMARY = "Path searching library for TeX-related files"
DESCRIPTION = "Kpathsea is a library and utility programs which provide path \
searching facilities for TeX file types, including the self- \
locating feature required for movable installations, layered on \
top of a general search mechanism. It is not distributed \
separately, but rather is released and maintained as part of \
the TeX-live sources."
LICENSE = "LGPL-2.1-or-later"

PV = "6.3.5"

RPM_NAME = "libkpathsea6-6.3.5-93.1.aarch64.rpm"
RPM_HASH = "b66d5ac46dc1d14e67686a7ef8516d1db2da5d5cd724888606df77462802ef563aaa1fecf19de44cd2152b9dfb04d0dc592c164c20675bfa1ec17383b787560d"

RPROVIDES:${PN} += "libkpathsea.so.6 \
libkpathsea6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
