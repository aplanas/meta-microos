SUMMARY = "Pure Python PDF toolkit"
DESCRIPTION = "PyPDF3 is a pure-python PDF library capable of splitting, merging together, \
cropping, and transforming the pages of PDF files. It can also add custom data, \
viewing options, and passwords to PDF files. It can retrieve text and metadata \
from PDFs as well as merge entire files together."
LICENSE = "BSD-3-Clause"

PV = "1.0.6"

RPM_NAME = "python310-PyPDF3-1.0.6-1.5.noarch.rpm"
RPM_HASH = "0a2643437bbac3379554e4cd204f7dea1d355ba24ca1fba1697b546699b4f482531a1fc168112f709bf9bd124ff44653a418565f241d2c01fad1b99c55ce086f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pypdf3 \
python310-PyPDF3 \
python3dist-pypdf3"

RDEPENDS:${PN} += "python-abi \
python310-tqdm"

inherit rpm
