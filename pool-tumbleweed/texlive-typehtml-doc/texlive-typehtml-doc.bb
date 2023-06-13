SUMMARY = "Documentation for texlive-typehtml"
DESCRIPTION = "This package includes the documentation for texlive-typehtml"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn17134"

RPM_NAME = "texlive-typehtml-doc-2023.201.svn17134-52.1.noarch.rpm"
RPM_HASH = "f68c1ae2fadc1174049eb1b043b24427fcd30ec59a597b57f5292a8df657aaa4278b94a481efd94009fbd004ae7193764473e3f6ce1e340b6400be78663fbef7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-typehtml-doc"

RDEPENDS:${PN} += ""

inherit rpm
