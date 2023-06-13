SUMMARY = "Library to work with PuppetDB's REST API"
DESCRIPTION = "This library is a wrapper around the REST API providing some convinience functions and objects to request and hold data from PuppetDB. \
More information: https://github.com/nedap/pypuppetdb"
LICENSE = "Apache-2.0"

PV = "2.5.1"

RPM_NAME = "python311-pypuppetdb-2.5.1-1.6.noarch.rpm"
RPM_HASH = "1aba03218e04fac319a6dd43246a145b2c70de2696c5dbbb25a558f47d29b811f67d98adf1bd32840b055695f8fcb4770dbaba763efc19437a54a50e82662e99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pypuppetdb) \
python311-pypuppetdb \
python3dist(pypuppetdb)"

RDEPENDS:${PN} += "python(abi) \
python311-requests"

inherit rpm
