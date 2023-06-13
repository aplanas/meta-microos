SUMMARY = "Generate and manipulate Open XML PowerPoint (pptx) files"
DESCRIPTION = "Generate and manipulate Open XML PowerPoint (.pptx) files."
LICENSE = "MIT"

PV = "0.6.21"

RPM_NAME = "python311-python-pptx-0.6.21-1.3.noarch.rpm"
RPM_HASH = "58366c3197fd40578af4ec055c5e951872d89495aa2ccb5abcb30209c26f83ffd94aa2a09612530ad523210156f9e1f00dc3968d3782ebcc7b969219e5d35ee6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-pptx) \
python311-python-pptx \
python3dist(python-pptx)"

RDEPENDS:${PN} += "python(abi) \
python311-Pillow \
python311-XlsxWriter \
python311-lxml"

inherit rpm
