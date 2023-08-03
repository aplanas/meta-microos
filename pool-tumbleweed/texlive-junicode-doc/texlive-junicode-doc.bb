SUMMARY = "Documentation for texlive-junicode"
DESCRIPTION = "This package includes the documentation for texlive-junicode"
LICENSE = "OFL-1.1"

PV = "2023.209.1.0.2svn61719"

RPM_NAME = "texlive-junicode-doc-2023.209.1.0.2svn61719-56.1.noarch.rpm"
RPM_HASH = "b68a816ffcb8394de6e4a45d60be95aade7bc53c2e400ec3ad3a6c96ae3ed97a715d37e59a185ec08a468032c52a3bdb00ccbaaefc1d2c5d4eb715799946cd22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-junicode-doc"

RDEPENDS:${PN} += ""

inherit rpm
