SUMMARY = "Generate and manipulate Open XML PowerPoint (pptx) files"
DESCRIPTION = "Generate and manipulate Open XML PowerPoint (.pptx) files."
LICENSE = "MIT"

PV = "0.6.21"

RPM_NAME = "python310-python-pptx-0.6.21-1.5.noarch.rpm"
RPM_HASH = "1467bc8d705764c13dd0ee77d9e75c0271996cc2f84b1eb86154d5a529e3328b98c13ee01b743d5219d16da8c19fe957d7f2497352149e4a88df67415fdd0ef4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-pptx \
python310-python-pptx \
python3dist-python-pptx"

RDEPENDS:${PN} += "python-abi \
python310-Pillow \
python310-XlsxWriter \
python310-lxml"

inherit rpm
