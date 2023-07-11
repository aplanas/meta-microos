SUMMARY = "Databases for ISO standards 639 3166 3166-2 4217 15924"
DESCRIPTION = "pycountry provides the ISO databases for the standards 639 (Languages), \
3166 (Countries), 3166-2 (Subdivisions of countries), 4217 (Currencies), \
15924 (Scripts). The databases are imported from Debian's pkg-isocodes, \
packaged into pycountry and made accessible through a Python API. \
Translation files for the various strings are included as well."
LICENSE = "LGPL-2.1-only"

PV = "22.3.5"

RPM_NAME = "python310-pycountry-22.3.5-2.3.noarch.rpm"
RPM_HASH = "cb897ec98852edab71fc9e3919aa05e7e4b3beac4d56989dc1b4bbf6fa88c70b84914d53989e9dd43d8deac309bf826db964df7af9b73fedebb1519084fcbb00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pycountry \
python310-pycountry \
python3dist-pycountry"

RDEPENDS:${PN} += "python-abi \
python310-lxml"

inherit rpm
