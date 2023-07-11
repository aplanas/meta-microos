SUMMARY = "Documentation of libepubgen API"
DESCRIPTION = "The libepubgen-doc package contains documentation files for libepubgen."
LICENSE = "MPL-2.0"

PV = "0.1.1"

RPM_NAME = "libepubgen-devel-doc-0.1.1-1.22.noarch.rpm"
RPM_HASH = "3c04dd42e76b5b98895f0c68c61bede5496c8177f48f98467f7ec15da326a63c69fa483a39d8f218e010154ba0acea49357bba991cfeec69710df18482d9befe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libepubgen-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
