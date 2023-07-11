SUMMARY = "Documentation for texlive-ebgaramond-maths"
DESCRIPTION = "This package includes the documentation for texlive-ebgaramond-maths"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn52168"

RPM_NAME = "texlive-ebgaramond-maths-doc-2023.201.1.2svn52168-53.2.noarch.rpm"
RPM_HASH = "904b3aa5c9a3e5a42a45ba33451796fd936ba58868bbb520a7a7343ad3050fb38b5cef0bbb73efb2e1fe865ee476274f9d4ac2318207f89012e80ec335ce5b9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ebgaramond-maths-doc"

RDEPENDS:${PN} += ""

inherit rpm
