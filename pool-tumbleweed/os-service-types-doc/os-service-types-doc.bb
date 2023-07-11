SUMMARY = "Documentation for OpenStack os-service-types library"
DESCRIPTION = "The OpenStack Service Types Authority contains information about official \
OpenStack services and their historical service-type aliases. \
The data is in JSON and the latest data should always be used. This simple \
library exists to allow for easy consumption of the data, along with a built-in \
version of the data to use in case network access is for some reason not \
possible and local caching of the fetched data. \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "1.7.0"

RPM_NAME = "os-service-types-doc-1.7.0-4.5.noarch.rpm"
RPM_HASH = "6be4ed2e626d5cd01dc66568483094ebb995ed87fc749c9618cb2480cffc96c998593f27dd342a3c1291ee09c268e60f3c4e7c72ffd248bb437dbd15b41263b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "os-service-types-doc"

RDEPENDS:${PN} += ""

inherit rpm
