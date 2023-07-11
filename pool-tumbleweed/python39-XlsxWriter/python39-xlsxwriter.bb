SUMMARY = "Python module for writing OOXML spreadsheet files"
DESCRIPTION = "XlsxWriter is a Python module for writing files in the Microsoft \
Office Open XML spreadsheet format. It can be used to write text, \
numbers, formulas and hyperlinks to multiple worksheets and it \
supports features such as formatting and many more."
LICENSE = "BSD-2-Clause"

PV = "3.0.3"

RPM_NAME = "python39-XlsxWriter-3.0.3-1.6.noarch.rpm"
RPM_HASH = "8ebfdd3721f1af4bb7a4aacf3079b1ac3ffadaeabf57f97fcbe3525e20e76e43b031d9c35a95e5dce61b0f7a2819f7ee17afc2382228c1fdabb135716112ac36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xlsxwriter \
python3.9dist-xlsxwriter \
python39-XlsxWriter \
python3dist-xlsxwriter"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
