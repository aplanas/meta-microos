SUMMARY = "Documentation for texlive-unfonts-extra"
DESCRIPTION = "This package includes the documentation for texlive-unfonts-extra"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn56291"

RPM_NAME = "texlive-unfonts-extra-doc-2023.209.svn56291-54.1.noarch.rpm"
RPM_HASH = "d298fc0102f7ef0d5ebfbc8134973e2e6c9dd24ca4f81707a3b80c325e87f0a48a014fc8aca10af32a4230f41edb6ff1a461fdb363c200019d85bdea03e3c324"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unfonts-extra-doc"

RDEPENDS:${PN} += ""

inherit rpm
