SUMMARY = "A Python library for rich text and beautiful formatting in the terminal"
DESCRIPTION = "Render rich text, tables, progress bars, syntax highlighting, \
markdown and more to the terminal."
LICENSE = "MIT"

PV = "13.4.1"

RPM_NAME = "python311-rich-13.4.1-1.3.noarch.rpm"
RPM_HASH = "3ae7103c164c4d0631fe742d303f1d4857b523ac9db891b1b58ead81d24c681657d515425e226cecdeb4493205bcc34255b99f0e2f23c1fff8994a728b92aadd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rich \
python3.11dist-rich \
python311-rich \
python3dist-rich"

RDEPENDS:${PN} += "python-abi \
python311-markdown-it-py \
python311-pygments"

inherit rpm
