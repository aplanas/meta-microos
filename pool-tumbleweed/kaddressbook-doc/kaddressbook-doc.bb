SUMMARY = "Documentation for kaddressbook"
DESCRIPTION = "This package includes the user guide for KAddressbook in HTML format."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kaddressbook-doc-23.04.3-1.1.noarch.rpm"
RPM_HASH = "34bcafba5595b4bbd1dfef8b7f6092a3aced03fa27a9226a69de09939791694c8c4916c95fa098cde3fb0b09a3df77268d0227eb88466c4b4f0db4e34808f024"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kaddressbook-doc"

RDEPENDS:${PN} += ""

inherit rpm
