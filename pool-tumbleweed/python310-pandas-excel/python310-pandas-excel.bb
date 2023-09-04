SUMMARY = "The python pandas[excel] extra"
DESCRIPTION = "This package provides the [excel] extra for python-pandas. \
(Except for pyxlsb, which is not available as openSUSE rpm package)"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-excel-2.0.3-1.2.noarch.rpm"
RPM_HASH = "cc84bf899797cd7665cb33b31cefdb6bf375fe635830041c065b4ae68ee22c15e17b058ea8633eb1cb4d935da4d4ecb17677e6d9f0064d7e48103dda191ed8d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-excel"

RDEPENDS:${PN} += "python310-XlsxWriter \
python310-odfpy \
python310-openpyxl \
python310-pandas \
python310-xlrd"

inherit rpm
