SUMMARY = "Databases for ISO standards 639 3166 3166-2 4217 15924"
DESCRIPTION = "pycountry provides the ISO databases for the standards 639 (Languages), \
3166 (Countries), 3166-2 (Subdivisions of countries), 4217 (Currencies), \
15924 (Scripts). The databases are imported from Debian's pkg-isocodes, \
packaged into pycountry and made accessible through a Python API. \
Translation files for the various strings are included as well."
LICENSE = "LGPL-2.1-only"

PV = "22.3.5"

RPM_NAME = "python39-pycountry-22.3.5-2.3.noarch.rpm"
RPM_HASH = "a3fb4ce95a539c5318b8c05c4a00a07177396ee4f9ac6212d9e2935d039a606831a0f8499340bd48c657f35f0bcba3ec7f1fdb36f3a75ea1b11cdb01aa69d534"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pycountry \
python39-pycountry \
python3dist-pycountry"

RDEPENDS:${PN} += "python-abi \
python39-lxml"

inherit rpm
