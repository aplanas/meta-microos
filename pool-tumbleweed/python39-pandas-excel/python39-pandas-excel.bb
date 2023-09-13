SUMMARY = "The python pandas[excel] extra"
DESCRIPTION = "This package provides the [excel] extra for python-pandas. \
(Except for pyxlsb, which is not available as openSUSE rpm package)"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python39-pandas-excel-2.1.0-1.2.noarch.rpm"
RPM_HASH = "0fb22e4069c1838ff4e8a3eb23c339a8f132c586a4b6b05e9a2987e4598b7c9e7f8dc698ef94fdcf4bb8045177704b815e30b3eac83a296fff7d1c666b2ed34c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-excel"

RDEPENDS:${PN} += "python39-XlsxWriter \
python39-odfpy \
python39-openpyxl \
python39-pandas \
python39-xlrd"

inherit rpm
