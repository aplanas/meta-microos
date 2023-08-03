SUMMARY = "Documentation for texlive-heros-otf"
DESCRIPTION = "This package includes the documentation for texlive-heros-otf"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn64695"

RPM_NAME = "texlive-heros-otf-doc-2023.209.0.0.01svn64695-54.1.noarch.rpm"
RPM_HASH = "0d79544dda1be472db768e421e9226bf79960079e8328dfa07480e7d14989083205c29b9deb36c600052ca7075f7948575984def58907f462312d16aec38a1ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-heros-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
