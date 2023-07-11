SUMMARY = "Pure Python PDF toolkit"
DESCRIPTION = "PyPDF3 is a pure-python PDF library capable of splitting, merging together, \
cropping, and transforming the pages of PDF files. It can also add custom data, \
viewing options, and passwords to PDF files. It can retrieve text and metadata \
from PDFs as well as merge entire files together."
LICENSE = "BSD-3-Clause"

PV = "1.0.6"

RPM_NAME = "python39-PyPDF3-1.0.6-1.5.noarch.rpm"
RPM_HASH = "9a36c6344e95d6489f90599dc5fcad1662c113d817d61c6e08ab5d0c1aa2017099d71e47cfa15842116eeb4ac22836ebb6b8d6542c8faadb756a442d41c7d9f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pypdf3 \
python39-PyPDF3 \
python3dist-pypdf3"

RDEPENDS:${PN} += "python-abi \
python39-tqdm"

inherit rpm
