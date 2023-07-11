SUMMARY = "A library of utilities for working with CSV"
DESCRIPTION = "CSVkit is a library of utilities for working with CSV. It is inspired \
by pdftk, gdal and the original csvcut utility by Joe Germuska and \
Aaron Bycoffe."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python39-csvkit-1.1.1-4.2.noarch.rpm"
RPM_HASH = "8fad48e7d8e136b1b8461ccb4e42cbef5e39597105a39b0e6f65f6a47f57530326632ba6ec6937aaf55ecd5cdf3582389002882e42e1e06a7c4e39d520d93a20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-csvkit \
python39-csvkit \
python3dist-csvkit"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-agate \
python39-agate-dbf \
python39-agate-excel \
python39-agate-sql \
update-alternatives"

inherit rpm
