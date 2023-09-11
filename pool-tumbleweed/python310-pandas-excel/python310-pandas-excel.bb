SUMMARY = "The python pandas[excel] extra"
DESCRIPTION = "This package provides the [excel] extra for python-pandas. \
(Except for pyxlsb, which is not available as openSUSE rpm package)"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-excel-2.0.3-1.3.noarch.rpm"
RPM_HASH = "85fe0905d509414c07cf0c14abfdad2ada7c3e2a6aca4492cd67f4b102d88d227a1fd51b6cdc5d3d22ebf27c4e474f3d8ddff3c8b3708d2574006cd241067bf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-excel"

RDEPENDS:${PN} += "python310-XlsxWriter \
python310-odfpy \
python310-openpyxl \
python310-pandas \
python310-xlrd"

inherit rpm
