SUMMARY = "Documentation for texlive-reotex"
DESCRIPTION = "This package includes the documentation for texlive-reotex"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn34924"

RPM_NAME = "texlive-reotex-doc-2023.201.1.1svn34924-53.2.noarch.rpm"
RPM_HASH = "69cfbf1c80325d58eb797aef6627e08b3a962f120931151a968352a93945d852dc4f476987eadfcf6cd77172f11ad50b91eb6fbdf6bfde3188a7428962294806"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-reotex-doc"

RDEPENDS:${PN} += ""

inherit rpm
