SUMMARY = "Test program for Voikko spell checker"
DESCRIPTION = "Libvoikko is a library of free natural language processing tools. It \
aims to provide support for languages that are not well served by \
other existing free linguistic tools. \
 \
This package contains a test program for using Voikko spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.2"

RPM_NAME = "voikkospell-4.3.2-2.1.aarch64.rpm"
RPM_HASH = "07ad0bb7116d1994e5c817f0d47f68664fd5d725a2059717186324b3182719d8e67437bcb4df01a64bb2e1dd40c91643336fa7ab7921d64a23432672fa040298"

RPROVIDES:${PN} += "voikkospell"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libvoikko.so.1 \
libvoikko1"

inherit rpm
