SUMMARY = "Documentation for audaspace"
DESCRIPTION = "The audaspace-doc package contains documentation for \
developing applications that use audaspace."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "audaspace-doc-1.4.0-1.4.noarch.rpm"
RPM_HASH = "dedc4f3f35e69efadfe9c1355234e51b1e61e197d598773c99a1009db488f4acd84746d390d483f85863a38d3719db00c1ff9156f01406c90a7e016a7d9ebb1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "audaspace-doc"

RDEPENDS:${PN} += ""

inherit rpm
