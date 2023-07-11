SUMMARY = "Pure Python PDF toolkit"
DESCRIPTION = "PyPDF3 is a pure-python PDF library capable of splitting, merging together, \
cropping, and transforming the pages of PDF files. It can also add custom data, \
viewing options, and passwords to PDF files. It can retrieve text and metadata \
from PDFs as well as merge entire files together."
LICENSE = "BSD-3-Clause"

PV = "1.0.6"

RPM_NAME = "python311-PyPDF3-1.0.6-1.5.noarch.rpm"
RPM_HASH = "47ffbe17e352f0aed0d9c53487fcd83c68dbdb6f27c3dd5a29d0f06277e9eebb454b073d61ace0df07aad6818806ea83adf743641fcd16d6ef019533470d9a43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyPDF3 \
python3.11dist-pypdf3 \
python311-PyPDF3 \
python3dist-pypdf3"

RDEPENDS:${PN} += "python-abi \
python311-tqdm"

inherit rpm
