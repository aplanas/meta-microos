SUMMARY = "Pure Python PDF toolkit"
DESCRIPTION = "PyPDF3 is a pure-python PDF library capable of splitting, merging together, \
cropping, and transforming the pages of PDF files. It can also add custom data, \
viewing options, and passwords to PDF files. It can retrieve text and metadata \
from PDFs as well as merge entire files together."
LICENSE = "BSD-3-Clause"

PV = "1.0.6"

RPM_NAME = "python39-PyPDF3-1.0.6-1.3.noarch.rpm"
RPM_HASH = "28ed938229c36346ccfdc55e03dae449abca72ea3507b24e7e1c977e3779eae544d77f89fab05c4888229021559caa249c4111eff944909e2bc710695d129339"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pypdf3) \
python39-PyPDF3 \
python3dist(pypdf3)"

RDEPENDS:${PN} += "python(abi) \
python39-tqdm"

inherit rpm
