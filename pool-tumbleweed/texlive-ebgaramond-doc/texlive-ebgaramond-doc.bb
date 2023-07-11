SUMMARY = "Documentation for texlive-ebgaramond"
DESCRIPTION = "This package includes the documentation for texlive-ebgaramond"
LICENSE = "OFL-1.1"

PV = "2023.201.svn64343"

RPM_NAME = "texlive-ebgaramond-doc-2023.201.svn64343-53.2.noarch.rpm"
RPM_HASH = "01aeaaf115ee3ff4836273b41217c9c3acf5b64f58b19090381169426243b6a518651a01d94b9d29852ceb57c3740a917e35250982b7ee78b1d8be17b52bea3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ebgaramond-doc"

RDEPENDS:${PN} += ""

inherit rpm
