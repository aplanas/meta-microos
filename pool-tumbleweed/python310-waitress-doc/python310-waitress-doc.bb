SUMMARY = "Waitress WSGI server"
DESCRIPTION = "This package contains documentation files for python310-waitress-doc."
LICENSE = "ZPL-2.1"

PV = "2.1.2"

RPM_NAME = "python310-waitress-doc-2.1.2-6.1.noarch.rpm"
RPM_HASH = "c9c503d5fa44cf6fe3d21fbb57893b2ed69bf38c5d01be4827988f6d980af0c141e813fd74d49f1bc9b0ef6a5e4df5e5a3de23ce6ea1f2ea1131432f643c0a26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-waitress-doc"

RDEPENDS:${PN} += ""

inherit rpm
