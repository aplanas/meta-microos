SUMMARY = "A library of utilities for working with CSV"
DESCRIPTION = "CSVkit is a library of utilities for working with CSV. It is inspired \
by pdftk, gdal and the original csvcut utility by Joe Germuska and \
Aaron Bycoffe."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python39-csvkit-1.1.1-4.1.noarch.rpm"
RPM_HASH = "714d8b16faab9f1fe7a6932b10663ae000cca743e22c30110a1b26f5a78981e5a84bcc77f5432353efd7a7031c0f324bf99babec9f7fdcb00e9004c4a4bf52af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-csvkit \
python39-csvkit \
python3dist-csvkit"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-agate \
python39-agate-dbf \
python39-agate-excel \
python39-agate-sql \
update-alternatives"

inherit rpm
