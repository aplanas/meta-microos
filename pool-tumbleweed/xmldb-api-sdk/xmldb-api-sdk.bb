SUMMARY = "SDK for XML:DB API"
DESCRIPTION = "The reference implementation provides a very simple file system based \
implementation of the XML:DB API. This provides what is basically a \
native XML database that uses directories to represent \
collections, and just stores the XML in files. \
 \
The driver development kit provides a set of base classes that can be \
extended to simplify and speed the development of XML:DB API drivers. \
These classes are used to provide the basis for the reference \
implementation, and therefore a simple example of how a driver can be \
implemented. Using the SDK classes significantly reduces the amount of \
code that must be written to create a new driver. \
 \
Along with the SDK base classes, the SDK also contains a set of jUnit \
test cases that can be used to help validate the driver while it is \
being developed. The test cases are still in development but there are \
enough tests currently to be useful."
LICENSE = "Apache-1.1"

PV = "0.1"

RPM_NAME = "xmldb-api-sdk-0.1-27.7.noarch.rpm"
RPM_HASH = "ade1092a9de89a3c9ca07a8958f3c5b593ad2448eb594302027b5d6223f2010d5f5bc862561174a12dfb72aadf52fc85867d1daee12dc2deecec96cc5916f11c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmldb-api-sdk"

RDEPENDS:${PN} += "xmldb-api"

inherit rpm
