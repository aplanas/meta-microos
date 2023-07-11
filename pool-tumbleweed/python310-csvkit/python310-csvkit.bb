SUMMARY = "A library of utilities for working with CSV"
DESCRIPTION = "CSVkit is a library of utilities for working with CSV. It is inspired \
by pdftk, gdal and the original csvcut utility by Joe Germuska and \
Aaron Bycoffe."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python310-csvkit-1.1.1-4.2.noarch.rpm"
RPM_HASH = "4014ba7da5fe66bebdc7dcb09be9f32d10574b2b4927a1220915b052a267ebbd6023100bcbe542b9080d83f2c400eee5ccc1681d11f443aba2e8b7e2f9aba3a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-csvkit \
python310-csvkit \
python3dist-csvkit"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-agate \
python310-agate-dbf \
python310-agate-excel \
python310-agate-sql \
update-alternatives"

inherit rpm
