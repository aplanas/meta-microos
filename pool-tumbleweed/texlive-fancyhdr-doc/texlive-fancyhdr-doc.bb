SUMMARY = "Documentation for texlive-fancyhdr"
DESCRIPTION = "This package includes the documentation for texlive-fancyhdr"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.1svn64977"

RPM_NAME = "texlive-fancyhdr-doc-2023.209.4.1svn64977-53.1.noarch.rpm"
RPM_HASH = "fb96b4666a8c488cee0abbf3a50130fa2e158ae493d39af54ab264a1ae1fca59b35f69c11d821302fd7d0dbe5ccfde2ac2b19a43fa75c0086072b069b2082cf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancyhdr-doc"

RDEPENDS:${PN} += ""

inherit rpm
