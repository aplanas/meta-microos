SUMMARY = "Waitress WSGI server"
DESCRIPTION = "This package contains documentation files for python310-waitress-doc."
LICENSE = "ZPL-2.1"

PV = "2.1.2"

RPM_NAME = "python310-waitress-doc-2.1.2-5.1.noarch.rpm"
RPM_HASH = "c0a620da150614011ed01f8dc6dfae50c18d3b752fd1329dfc43b503dd1e7ed1f0082aea90193099f9411cef2ea0989dfac68d070104d573739fd214be6284e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-waitress-doc"

RDEPENDS:${PN} += ""

inherit rpm
