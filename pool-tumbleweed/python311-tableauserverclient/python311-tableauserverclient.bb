SUMMARY = "Python library for working with the Tableau Server REST API"
DESCRIPTION = "A Python module for working with the Tableau Server REST API."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "python311-tableauserverclient-0.18.0-1.7.noarch.rpm"
RPM_HASH = "58c5be944d0cee26897eb73b8933109d1f571424f8dc5f58cc1307e3862f59c96cc3c2f16887f592cc4fad978b6652496174ac54cff1e7589b0b1473bb064d9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tableauserverclient) \
python311-tableauserverclient \
python3dist(tableauserverclient)"

RDEPENDS:${PN} += "python(abi) \
python311-requests"

inherit rpm
