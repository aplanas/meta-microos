SUMMARY = "Documentation for texlive-biblatex-abnt"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-abnt"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.4svn49179"

RPM_NAME = "texlive-biblatex-abnt-doc-2023.209.3.4svn49179-54.1.noarch.rpm"
RPM_HASH = "fcac8dbe25b4af84e7bcef125a5dc7131bb5e864e5b43b60fc4f67f40f8608b148a995508586bcf78b33de3edefd69b29a66339472488c2b02b13d4e80501c84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-biblatex-abnt-doc-pt-BR \
texlive-biblatex-abnt-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
