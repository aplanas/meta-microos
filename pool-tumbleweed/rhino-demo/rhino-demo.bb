SUMMARY = "Examples for rhino"
DESCRIPTION = "Examples for rhino"
LICENSE = "MPL-2.0"

PV = "1.7.14"

RPM_NAME = "rhino-demo-1.7.14-2.4.noarch.rpm"
RPM_HASH = "c2baa84cd53c68960c762964a8b6f1095a847c144efad08a4aae9a3d94b2b5d83ad7235810f3e9590142779512411f8c6265c7b44c5819193a781cc0f8c4478a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rhino-demo"

RDEPENDS:${PN} += ""

inherit rpm
