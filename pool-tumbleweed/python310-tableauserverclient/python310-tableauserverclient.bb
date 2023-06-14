SUMMARY = "Python library for working with the Tableau Server REST API"
DESCRIPTION = "A Python module for working with the Tableau Server REST API."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "python310-tableauserverclient-0.18.0-1.7.noarch.rpm"
RPM_HASH = "d91d223d17b65b462f512da78b8695874f71a2b7e45c69f7be77a886f7921854809a0026695893c53e819e3bcb2388db4155d1f7d591bb47469dbdaf7d72b2fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tableauserverclient \
python3.10dist-tableauserverclient \
python310-tableauserverclient \
python3dist-tableauserverclient"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
