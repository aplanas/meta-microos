SUMMARY = "Databases for ISO standards 639 3166 3166-2 4217 15924"
DESCRIPTION = "pycountry provides the ISO databases for the standards 639 (Languages), \
3166 (Countries), 3166-2 (Subdivisions of countries), 4217 (Currencies), \
15924 (Scripts). The databases are imported from Debian's pkg-isocodes, \
packaged into pycountry and made accessible through a Python API. \
Translation files for the various strings are included as well."
LICENSE = "LGPL-2.1-only"

PV = "22.3.5"

RPM_NAME = "python311-pycountry-22.3.5-2.1.noarch.rpm"
RPM_HASH = "fdb535b5a07d8e15f5628eee298c8f1bdb0712026b548e9e398774a72f6ee478faa9ae5c4d2e3d6391299d7831013c8b5840a0526d0d62b856a7c38bb7abbd95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pycountry) \
python311-pycountry \
python3dist(pycountry)"

RDEPENDS:${PN} += "python(abi) \
python311-lxml"

inherit rpm
