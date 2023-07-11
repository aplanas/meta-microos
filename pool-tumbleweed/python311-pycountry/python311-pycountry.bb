SUMMARY = "Databases for ISO standards 639 3166 3166-2 4217 15924"
DESCRIPTION = "pycountry provides the ISO databases for the standards 639 (Languages), \
3166 (Countries), 3166-2 (Subdivisions of countries), 4217 (Currencies), \
15924 (Scripts). The databases are imported from Debian's pkg-isocodes, \
packaged into pycountry and made accessible through a Python API. \
Translation files for the various strings are included as well."
LICENSE = "LGPL-2.1-only"

PV = "22.3.5"

RPM_NAME = "python311-pycountry-22.3.5-2.3.noarch.rpm"
RPM_HASH = "0626592edbf549949e72f0da1fa4e8ce675971458462de7238ea78b7643b20d597e9f5c4644906854e55674628779b568fcb051a8e9608a2e93cf40930ebb739"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pycountry \
python3.11dist-pycountry \
python311-pycountry \
python3dist-pycountry"

RDEPENDS:${PN} += "python-abi \
python311-lxml"

inherit rpm
