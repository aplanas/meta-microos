SUMMARY = "en_US Locale Data for Localized Programs"
DESCRIPTION = "Locale data for the internationalisation features of the GNU C library. \
This package contains only the U.S. English locale."
LICENSE = "GPL-2.0-or-later & MIT & LGPL-2.1-or-later"

PV = "2.37"

RPM_NAME = "glibc-locale-base-2.37-4.4.aarch64.rpm"
RPM_HASH = "1d59fd6df9bd421725b68f2413f867ef4e72fcf694843c4ea8c2344299a50d7d0f76e111dd528f1cdac0d7f0c5c4ed6729244d3e8388f0537d9a08ab47a0895f"

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
