SUMMARY = "A library for unified interface to PDF sets"
DESCRIPTION = "LHAPDF provides a unified and interface to PDF (probability \
distribution function) sets. It also works with the more recent \
multiple 'error' sets, and incorporates many of the older sets found \
in PDFLIB, including pion and photon PDFs. In LHAPDF, the computer \
code and input parameters/grids are separated, thus allowing updating \
and no limit to the expansion possibilities."
LICENSE = "GPL-3.0-only"

PV = "6.5.4"

RPM_NAME = "python311-LHAPDF-6.5.4-1.1.aarch64.rpm"
RPM_HASH = "751f650db59f04c7f98433ffd4410c4b64102e3769be86d491fc18034fe7af4181d78b7560296b9ed4cf0ad0aae2ea8d5ca2eec4649904c676bfdb317884cdfb"

RPROVIDES:${PN} += "python311-LHAPDF"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLHAPDF-6.5.4.so \
libc.so.6 \
libgcc-s.so.1 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
python-abi \
update-alternatives"

inherit rpm
