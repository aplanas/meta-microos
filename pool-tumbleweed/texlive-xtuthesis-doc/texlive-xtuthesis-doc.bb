SUMMARY = "Documentation for texlive-xtuthesis"
DESCRIPTION = "This package includes the documentation for texlive-xtuthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn47049"

RPM_NAME = "texlive-xtuthesis-doc-2023.209.1.0svn47049-53.2.noarch.rpm"
RPM_HASH = "af82e42a38356cbcd0c1fcae12cded294ad96dc8ee4cd9e9f0d08791afb5de62e4ee4aa388daeb28686b642ebb79a15ff008bfc318a2007697b32d44c15b869f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xtuthesis-doc-zh \
texlive-xtuthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
