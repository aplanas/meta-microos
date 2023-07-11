SUMMARY = "Waitress WSGI server"
DESCRIPTION = "This package contains documentation files for python39-waitress-doc."
LICENSE = "ZPL-2.1"

PV = "2.1.2"

RPM_NAME = "python39-waitress-doc-2.1.2-5.1.noarch.rpm"
RPM_HASH = "731adfa4eade3e234366f7b3244326f3c0ec952359559b5d771301541515e487f7833cfb2a2d2e1a0b2b7f3c15ae772bf393ad97f0483c3c8182f19eab88be8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-waitress-doc"

RDEPENDS:${PN} += ""

inherit rpm
