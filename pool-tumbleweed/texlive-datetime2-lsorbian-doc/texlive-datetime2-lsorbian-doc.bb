SUMMARY = "Documentation for texlive-datetime2-lsorbian"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-lsorbian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn47749"

RPM_NAME = "texlive-datetime2-lsorbian-doc-2023.201.1.1svn47749-52.1.noarch.rpm"
RPM_HASH = "4e36ee424c5f5e76dc20506f001e9169752ff8401ae5d4d85fe054d0314ed780f7e8ccc112388a01cb36b5355b3c4ef02f9c22269e2b9564ffbcac7e4c61f1dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-lsorbian-doc"
RDEPENDS:${PN} += ""

inherit rpm
