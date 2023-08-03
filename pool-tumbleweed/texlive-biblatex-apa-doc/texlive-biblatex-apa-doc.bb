SUMMARY = "Documentation for texlive-biblatex-apa"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-apa"
LICENSE = "LPPL-1.0"

PV = "2023.209.9.16svn63719"

RPM_NAME = "texlive-biblatex-apa-doc-2023.209.9.16svn63719-54.1.noarch.rpm"
RPM_HASH = "88e554561ae16f02d05522018d599420e581e4650235181c686825e1e3fee50f60788ac9cf8580859f9efc13072b0d20b2f4bb47f3c915d8fb568e44a34c043c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-apa-doc"

RDEPENDS:${PN} += ""

inherit rpm
