SUMMARY = "Python L20n library"
DESCRIPTION = "L20n mozilla markings for translations. \
 \
Better solution today is to use python fluent module."
LICENSE = "Apache-2.0"

PV = "4.0.0a1"

RPM_NAME = "python310-l20n-4.0.0a1-2.3.noarch.rpm"
RPM_HASH = "3fbb873b4dcf60ba5b678460b71ac7f186fefade59a4d7ac17c4d3f8c1fd41942954dc8f919e057da5ee1252ac03ed0dfba8d41deb0212994566f21e4f9f8cf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-l20n \
python3.10dist-l20n \
python310-l20n \
python3dist-l20n"

RDEPENDS:${PN} += "python-abi"

inherit rpm
