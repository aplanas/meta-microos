SUMMARY = "Generate and manipulate Open XML PowerPoint (pptx) files"
DESCRIPTION = "Generate and manipulate Open XML PowerPoint (.pptx) files."
LICENSE = "MIT"

PV = "0.6.21"

RPM_NAME = "python39-python-pptx-0.6.21-1.3.noarch.rpm"
RPM_HASH = "496a19383e880fd6a7faef1ce885a221b607af9efd1a72e42da4778f9fcfd5cb82f18196141df767c383f01e9bc7c816375790fbbca1d709d285eddef560ee5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-pptx \
python39-python-pptx \
python3dist-python-pptx"

RDEPENDS:${PN} += "python-abi \
python39-Pillow \
python39-XlsxWriter \
python39-lxml"

inherit rpm
