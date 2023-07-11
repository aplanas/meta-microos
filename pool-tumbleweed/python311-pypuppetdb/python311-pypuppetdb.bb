SUMMARY = "Library to work with PuppetDB's REST API"
DESCRIPTION = "This library is a wrapper around the REST API providing some convinience functions and objects to request and hold data from PuppetDB. \
More information: https://github.com/nedap/pypuppetdb"
LICENSE = "Apache-2.0"

PV = "2.5.1"

RPM_NAME = "python311-pypuppetdb-2.5.1-1.8.noarch.rpm"
RPM_HASH = "5ba4e5c036fb226651b6ecc89c9e93bf54b836ac3b1821a019fdded82aeff5fec10e5872e43d9beaf295fdaf50f573b01738de26bd538231ac689dacf8e96c07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pypuppetdb \
python3.11dist-pypuppetdb \
python311-pypuppetdb \
python3dist-pypuppetdb"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
