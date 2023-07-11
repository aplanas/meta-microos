SUMMARY = "Library to work with PuppetDB's REST API"
DESCRIPTION = "This library is a wrapper around the REST API providing some convinience functions and objects to request and hold data from PuppetDB. \
More information: https://github.com/nedap/pypuppetdb"
LICENSE = "Apache-2.0"

PV = "2.5.1"

RPM_NAME = "python310-pypuppetdb-2.5.1-1.8.noarch.rpm"
RPM_HASH = "97313e28678373c18f0e4e91a996fc37c2a1e1422352317d3b9696865c50a2f5b9ec3dc339bd0cc3826f5b01185bd32b1ae0134e90070bff0c09b25753e11172"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pypuppetdb \
python310-pypuppetdb \
python3dist-pypuppetdb"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
