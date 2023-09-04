SUMMARY = "The python pandas[excel] extra"
DESCRIPTION = "This package provides the [excel] extra for python-pandas. \
(Except for pyxlsb, which is not available as openSUSE rpm package)"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-excel-2.0.3-1.2.noarch.rpm"
RPM_HASH = "0de160819f178bc83fa0cf6731368a1f042c58212ec50767bb5eb14fb8d6c26377d8492cbf77b602c0c711085c512f361e29df83756ace20fbbbb8ca651d6688"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-excel \
python311-pandas-excel"

RDEPENDS:${PN} += "python311-XlsxWriter \
python311-odfpy \
python311-openpyxl \
python311-pandas \
python311-xlrd"

inherit rpm
