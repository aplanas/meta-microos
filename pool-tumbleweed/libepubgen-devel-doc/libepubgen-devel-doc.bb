SUMMARY = "Documentation of libepubgen API"
DESCRIPTION = "The libepubgen-doc package contains documentation files for libepubgen."
LICENSE = "MPL-2.0"

PV = "0.1.1"

RPM_NAME = "libepubgen-devel-doc-0.1.1-1.21.noarch.rpm"
RPM_HASH = "23b9f227fd6ced83dfe2ab253423659b42681404d603fb34d6b0a83eb405e4c8655e711a81819f2163b8ffcde1b46d10cc7a276a5b317e0d71c3af8ae57ec889"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libepubgen-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
