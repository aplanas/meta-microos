SUMMARY = "Documentation for texlive-studenthandouts"
DESCRIPTION = "This package includes the documentation for texlive-studenthandouts"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn43516"

RPM_NAME = "texlive-studenthandouts-doc-2023.209.1.0svn43516-58.1.noarch.rpm"
RPM_HASH = "d24ee2b138f746ffb50aa35e375cf761b3ef68548e153877b80480737c30490b752ddf292c3e126d61a746d8b956ff77026a24407bae3aaea8d0cea425481f74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-studenthandouts-doc"

RDEPENDS:${PN} += ""

inherit rpm
