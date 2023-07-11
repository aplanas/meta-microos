SUMMARY = "Generate and manipulate Open XML PowerPoint (pptx) files"
DESCRIPTION = "Generate and manipulate Open XML PowerPoint (.pptx) files."
LICENSE = "MIT"

PV = "0.6.21"

RPM_NAME = "python311-python-pptx-0.6.21-1.5.noarch.rpm"
RPM_HASH = "8e11a63c5ab147f2aa81d7fbbf8d950ac78d6a277caf7c5107870103930e0198aa66ffc54ed38d864942891ace160e2f2d25d817fa18373b0a55a6646a85ea64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-pptx \
python3.11dist-python-pptx \
python311-python-pptx \
python3dist-python-pptx"

RDEPENDS:${PN} += "python-abi \
python311-Pillow \
python311-XlsxWriter \
python311-lxml"

inherit rpm
