SUMMARY = "Python module to create reports from Python objects"
DESCRIPTION = "This is a Python module to create reports from Python objects. \
Output plugins to several formats are included, such \
as documents (odt, ods, pdf) or images (png, svg)."
LICENSE = "GPL-3.0-or-later"

PV = "0.10.1"

RPM_NAME = "python310-relatorio-0.10.1-1.8.noarch.rpm"
RPM_HASH = "14b1634091545043bef4dad478ba115a584b435e70f038548a74529754a4d66abe9bf7858a243234eda754e2972923e2e24b9aa9e3b5dfa5df97ef29082811a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-relatorio \
python310-relatorio \
python3dist-relatorio"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Genshi \
python310-PyYAML \
python310-lxml \
python310-pycha \
python310-python-magic \
update-alternatives"

inherit rpm
