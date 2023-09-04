SUMMARY = "Documentation for texlive-grabbox"
DESCRIPTION = "This package includes the documentation for texlive-grabbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn65223"

RPM_NAME = "texlive-grabbox-doc-2023.209.1.4svn65223-54.2.noarch.rpm"
RPM_HASH = "813ece17b70aa5cb4f7dd7094177072c2e1a9ccc155edb0de8d0c447a97e445829da30c0f5960cee2b381b94fcc8179bea15d6f5b19f79d944834b1329160891"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grabbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
