SUMMARY = "A library for unified interface to PDF sets"
DESCRIPTION = "LHAPDF provides a unified and interface to PDF (probability \
distribution function) sets. It also works with the more recent \
multiple 'error' sets, and incorporates many of the older sets found \
in PDFLIB, including pion and photon PDFs. In LHAPDF, the computer \
code and input parameters/grids are separated, thus allowing updating \
and no limit to the expansion possibilities."
LICENSE = "GPL-3.0-only"

PV = "6.5.4"

RPM_NAME = "python311-LHAPDF-6.5.4-1.2.aarch64.rpm"
RPM_HASH = "c87946a02ac5a570762e9079ea716efcbe60158bf220e55b8d81371f1f9e3d540e1834aa338635c2c3a4598f4365d7ad439ed8de22c8695c5e2ffce892bf93be"

RPROVIDES:${PN} += "python3-LHAPDF \
python311-LHAPDF"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLHAPDF-6.5.4.so \
libc.so.6 \
libgcc-s.so.1 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
python-abi \
update-alternatives"

inherit rpm
