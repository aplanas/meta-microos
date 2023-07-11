SUMMARY = "A library of utilities for working with CSV"
DESCRIPTION = "CSVkit is a library of utilities for working with CSV. It is inspired \
by pdftk, gdal and the original csvcut utility by Joe Germuska and \
Aaron Bycoffe."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python311-csvkit-1.1.1-4.2.noarch.rpm"
RPM_HASH = "857f381c59b6e02ada9275d2847aa8036439ec004a0b1cec1073e9635f920db165befef9400dcd5173af2a049660446c495f3e5b6984ab35b61565dd8d1d264b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-csvkit \
python3.11dist-csvkit \
python311-csvkit \
python3dist-csvkit"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-agate \
python311-agate-dbf \
python311-agate-excel \
python311-agate-sql \
update-alternatives"

inherit rpm
