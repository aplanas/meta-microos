SUMMARY = "A library for unified interface to PDF sets"
DESCRIPTION = "LHAPDF provides a unified and interface to PDF (probability \
distribution function) sets. It also works with the more recent \
multiple 'error' sets, and incorporates many of the older sets found \
in PDFLIB, including pion and photon PDFs. In LHAPDF, the computer \
code and input parameters/grids are separated, thus allowing updating \
and no limit to the expansion possibilities."
LICENSE = "GPL-3.0-only"

PV = "6.5.4"

RPM_NAME = "python310-LHAPDF-6.5.4-1.1.aarch64.rpm"
RPM_HASH = "3686bbd0e6836f9e1dbc029974d60fd9627c0cdc418294b00f3a5fb279b217ad1e911bc7ac37b4654d1348c06ce9f955518ed6be7e2857c31543cb4c4c767894"

RPROVIDES:${PN} += "python3-LHAPDF \
python310-LHAPDF"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLHAPDF-6.5.4.so \
libc.so.6 \
libgcc-s.so.1 \
libpython3.10.so.1.0 \
libstdc++.so.6 \
python-abi \
update-alternatives"

inherit rpm
