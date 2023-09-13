SUMMARY = "Common files for PowerMock"
DESCRIPTION = " \
PowerMock is a framework that extend other mock libraries \
such as EasyMock with more powerful capabilities. PowerMock uses a \
custom classloader and bytecode manipulation to enable mocking of \
static methods, constructors, final classes and methods, private \
methods, removal of static initializers and more. \
 \
This package contains common files for all PowerMock modules."
LICENSE = "Apache-2.0"

PV = "1.6.5"

RPM_NAME = "powermock-common-1.6.5-5.1.noarch.rpm"
RPM_HASH = "05ecf4ecda74befabac5bdc9136f3e68f30129f1ebd7b6b1373c8043fd3d3e862ebf27cafe1460309fe73f63b3446b64834b7a98fda361905d847ffaa21dbc46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "powermock-common"

RDEPENDS:${PN} += ""

inherit rpm
