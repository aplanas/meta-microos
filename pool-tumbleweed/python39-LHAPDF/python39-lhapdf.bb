SUMMARY = "A library for unified interface to PDF sets"
DESCRIPTION = "LHAPDF provides a unified and interface to PDF (probability \
distribution function) sets. It also works with the more recent \
multiple 'error' sets, and incorporates many of the older sets found \
in PDFLIB, including pion and photon PDFs. In LHAPDF, the computer \
code and input parameters/grids are separated, thus allowing updating \
and no limit to the expansion possibilities."
LICENSE = "GPL-3.0-only"

PV = "6.5.4"

RPM_NAME = "python39-LHAPDF-6.5.4-1.1.aarch64.rpm"
RPM_HASH = "cff153a23a1ddf35eb95bfd2b5796304b8d78ba6b3e0e0429d9d978e9420d56b69512548778262b9d745d7c29bb774b6a9823ea706c79389fe615107f51567da"

RPROVIDES:${PN} += "python39-LHAPDF \
python39-LHAPDF(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libLHAPDF-6.5.4.so()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libpython3.9.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
update-alternatives"

inherit rpm
