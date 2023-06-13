SUMMARY = "Math extension for Python-Markdown"
DESCRIPTION = "This extension adds math formulas support to Python-Markdown."
LICENSE = "BSD-3-Clause"

PV = "0.8"

RPM_NAME = "python311-markdown-math-0.8-1.8.noarch.rpm"
RPM_HASH = "cf0236790a13ca478a33cbad5f1a71b6a3342710a2bbae62b8db81213f52a7be3cbf76ca814975675b9fcd62154f2dd36b08f31f393700b8f380e774b617ee0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-markdown-math) \
python311-markdown-math \
python3dist(python-markdown-math)"

RDEPENDS:${PN} += "python(abi) \
python311-Markdown"

inherit rpm
