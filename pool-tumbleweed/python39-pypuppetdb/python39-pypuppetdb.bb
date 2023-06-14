SUMMARY = "Library to work with PuppetDB's REST API"
DESCRIPTION = "This library is a wrapper around the REST API providing some convinience functions and objects to request and hold data from PuppetDB. \
More information: https://github.com/nedap/pypuppetdb"
LICENSE = "Apache-2.0"

PV = "2.5.1"

RPM_NAME = "python39-pypuppetdb-2.5.1-1.6.noarch.rpm"
RPM_HASH = "d8cb0734a93c54eb37a9d95916006d633206d9a96b63b20c44442fd573e9e8fa8efd3972a95384d70a186618b9a761342e8015f31f2ad4d7ce7094d9b11f3a70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pypuppetdb \
python39-pypuppetdb \
python3dist-pypuppetdb"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
