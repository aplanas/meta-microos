SUMMARY = "en_US Locale Data for Localized Programs"
DESCRIPTION = "Locale data for the internationalisation features of the GNU C library. \
This package contains only the U.S. English locale."
LICENSE = "GPL-2.0-or-later & MIT & LGPL-2.1-or-later"

PV = "2.37"

RPM_NAME = "glibc-locale-base-2.37-5.1.aarch64.rpm"
RPM_HASH = "c22f5f7bdb017384e4df15336ecceb52e847c9f4584f9a76d12c52059a28935b05c88ed5026d1451478e88e1460ff59bb4047973aabbf324efd3c95c2ca66b45"

RPROVIDES:${PN} += "glibc-locale-base \
libCNS.so \
libGB.so \
libISOIR165.so \
libJIS.so \
libJISX0213.so \
libKSC.so"

RDEPENDS:${PN} += "/usr/bin/cat \
/usr/bin/sh \
glibc \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
