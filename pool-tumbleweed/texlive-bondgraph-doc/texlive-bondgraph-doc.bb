SUMMARY = "Documentation for texlive-bondgraph"
DESCRIPTION = "This package includes the documentation for texlive-bondgraph"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn21670"

RPM_NAME = "texlive-bondgraph-doc-2023.201.1.0svn21670-52.1.noarch.rpm"
RPM_HASH = "f2ad2358346739fdb68e0c7005f8db28e2ce6d7c77829a19c8ebc6b09519ac6a98cef20785ec9f60f23d39cc56a6926107e4610b14673c3d905dfbb252f91ab3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bondgraph-doc"

RDEPENDS:${PN} += ""

inherit rpm
