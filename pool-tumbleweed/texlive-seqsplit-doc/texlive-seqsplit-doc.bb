SUMMARY = "Documentation for texlive-seqsplit"
DESCRIPTION = "This package includes the documentation for texlive-seqsplit"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn15878"

RPM_NAME = "texlive-seqsplit-doc-2023.201.0.0.1svn15878-53.1.noarch.rpm"
RPM_HASH = "935f4f2bf712670567981436de0ee2e766b84669654c0c59cb9ce5fed4312a700e9228f9b694c8d098b8379dbb1259edaf6879a962e7b2de4b6dfab1687c4591"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-seqsplit-doc"
RDEPENDS:${PN} += ""

inherit rpm
