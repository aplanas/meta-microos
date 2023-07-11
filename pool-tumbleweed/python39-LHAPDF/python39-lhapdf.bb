SUMMARY = "A library for unified interface to PDF sets"
DESCRIPTION = "LHAPDF provides a unified and interface to PDF (probability \
distribution function) sets. It also works with the more recent \
multiple 'error' sets, and incorporates many of the older sets found \
in PDFLIB, including pion and photon PDFs. In LHAPDF, the computer \
code and input parameters/grids are separated, thus allowing updating \
and no limit to the expansion possibilities."
LICENSE = "GPL-3.0-only"

PV = "6.5.4"

RPM_NAME = "python39-LHAPDF-6.5.4-1.2.aarch64.rpm"
RPM_HASH = "9dc8f1e6e4c4b2f6d643669f1dc4a9628d69b62c64ad4108aa42c00bb4e6108fff12b893dc10c3ca0bddc7704e7d6e96ea7b7fba52066aacce7d87ba5ec988c6"

RPROVIDES:${PN} += "python39-LHAPDF"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLHAPDF-6.5.4.so \
libc.so.6 \
libgcc-s.so.1 \
libpython3.9.so.1.0 \
libstdc++.so.6 \
python-abi \
update-alternatives"

inherit rpm
