SUMMARY = "Library to work with PuppetDB's REST API"
DESCRIPTION = "This library is a wrapper around the REST API providing some convinience functions and objects to request and hold data from PuppetDB. \
More information: https://github.com/nedap/pypuppetdb"
LICENSE = "Apache-2.0"

PV = "2.5.1"

RPM_NAME = "python39-pypuppetdb-2.5.1-1.8.noarch.rpm"
RPM_HASH = "affffba8f376427abc8f8ac844cf17d0781ed4a80ba61426aee11dd06cf72cc3daa8b6cae1057045152114a61e0cb45707d747900ff9742170a272f2c245d4e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pypuppetdb \
python39-pypuppetdb \
python3dist-pypuppetdb"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
