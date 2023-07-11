SUMMARY = "A library for unified interface to PDF sets"
DESCRIPTION = "LHAPDF provides a unified and interface to PDF (probability \
distribution function) sets. It also works with the more recent \
multiple 'error' sets, and incorporates many of the older sets found \
in PDFLIB, including pion and photon PDFs. In LHAPDF, the computer \
code and input parameters/grids are separated, thus allowing updating \
and no limit to the expansion possibilities."
LICENSE = "GPL-3.0-only"

PV = "6.5.4"

RPM_NAME = "python310-LHAPDF-6.5.4-1.2.aarch64.rpm"
RPM_HASH = "2ddd7e95c25654cf6829f8c07c2d429950212a4bb5b09861d329d173a0a9e0bf23ab5109b410db5d439dcd21ac395c3c94fa3db836752c5a96b95f0d7603ea35"

RPROVIDES:${PN} += "python310-LHAPDF"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLHAPDF-6.5.4.so \
libc.so.6 \
libgcc-s.so.1 \
libpython3.10.so.1.0 \
libstdc++.so.6 \
python-abi \
update-alternatives"

inherit rpm
