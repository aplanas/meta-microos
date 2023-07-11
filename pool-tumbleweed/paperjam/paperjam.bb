SUMMARY = "A tool for transforming PDF documents"
DESCRIPTION = "PaperJam is a tool for processing PDF documents: re-ordering pages, \
scaling and rotating them, placing multiple pages on one sheet of paper, \
adding cropmarks, and many other tricks."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1"

RPM_NAME = "paperjam-1.1.1-3.4.aarch64.rpm"
RPM_HASH = "85ddd7927d6b3a65a4ae898a588e454cf8feb6a79adc8c7d754db5a27ee9c4c43b51eb3f8b45b92813725319a0e8ced16d13a47a547014353d23372592475e2e"

RPROVIDES:${PN} += "paperjam"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpaper.so.2 \
libqpdf.so.29 \
libstdc++.so.6"

inherit rpm
