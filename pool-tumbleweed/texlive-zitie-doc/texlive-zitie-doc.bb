SUMMARY = "Documentation for texlive-zitie"
DESCRIPTION = "This package includes the documentation for texlive-zitie"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4.0svn60676"

RPM_NAME = "texlive-zitie-doc-2023.209.1.4.0svn60676-53.1.noarch.rpm"
RPM_HASH = "f12fce844e5c2176ca1ed60ff04ec9590145dc16bb54193ca61b5329f5f7e59679d39e70fe91a113732879f1dd74848fcdbcd5b74010393949d98cd7fd7fba70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-zitie-doc-zh \
texlive-zitie-doc"

RDEPENDS:${PN} += ""

inherit rpm
