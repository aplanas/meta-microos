SUMMARY = "The 'country' module for the Tryton ERP system"
DESCRIPTION = "The country module defines the concepts of country and subdivision in \
the Tryton application platform. The module comes preloaded with the \
ISO 3166 list of countries and subdivisions thanks to the pycountry \
module."
LICENSE = "GPL-3.0-only"

PV = "6.0.3"

RPM_NAME = "trytond_country-6.0.3-1.3.noarch.rpm"
RPM_HASH = "e1f34ac05a02b19f61236199a99c46e8456d4096ea5b70f3093321c58219239f04d2aad656116ec157d05918574e3334e75f7449ca7ea4118e1adca3543754ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-trytond-country \
python3dist-trytond-country \
trytond-country"

RDEPENDS:${PN} += "/usr/bin/python3 \
proteus \
python-abi \
python3-pycountry \
trytond"

inherit rpm
