SUMMARY = "Generate and manipulate Open XML PowerPoint (pptx) files"
DESCRIPTION = "Generate and manipulate Open XML PowerPoint (.pptx) files."
LICENSE = "MIT"

PV = "0.6.21"

RPM_NAME = "python310-python-pptx-0.6.21-1.3.noarch.rpm"
RPM_HASH = "d1bfbe14e5686c5023738da82e2e223ee75338ffcedfa6b080de443c8fe8dcc20b7d8fadf0579cf29601aa6e544efc2fbbcc314ab65b5d831d1d45839c93a85f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-pptx \
python3.10dist-python-pptx \
python310-python-pptx \
python3dist-python-pptx"

RDEPENDS:${PN} += "python-abi \
python310-Pillow \
python310-XlsxWriter \
python310-lxml"

inherit rpm
