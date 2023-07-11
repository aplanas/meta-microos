SUMMARY = "Generate and manipulate Open XML PowerPoint (pptx) files"
DESCRIPTION = "Generate and manipulate Open XML PowerPoint (.pptx) files."
LICENSE = "MIT"

PV = "0.6.21"

RPM_NAME = "python39-python-pptx-0.6.21-1.5.noarch.rpm"
RPM_HASH = "d9b1b7b3225cf78d1b2803e049f3b53f73abc43cc2f036bb046edbce1c3b6550d68bd013cc321afe089f6835a0226c1ab707de7063cd6759022c3ac8c8925eed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-pptx \
python39-python-pptx \
python3dist-python-pptx"

RDEPENDS:${PN} += "python-abi \
python39-Pillow \
python39-XlsxWriter \
python39-lxml"

inherit rpm
