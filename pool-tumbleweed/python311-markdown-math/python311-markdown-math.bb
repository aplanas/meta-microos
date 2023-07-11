SUMMARY = "Math extension for Python-Markdown"
DESCRIPTION = "This extension adds math formulas support to Python-Markdown."
LICENSE = "BSD-3-Clause"

PV = "0.8"

RPM_NAME = "python311-markdown-math-0.8-1.10.noarch.rpm"
RPM_HASH = "9a2fcb383d2dc9c60d0ba26eaef36bf32324e47967d628a381c3bf3fa25fc6dff4c64d69337ece80e5ebe759d25b894c9e5c333b9dbb4c27ef630c2a3e6cffc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-markdown-math \
python3.11dist-python-markdown-math \
python311-markdown-math \
python3dist-python-markdown-math"

RDEPENDS:${PN} += "python-abi \
python311-Markdown"

inherit rpm
