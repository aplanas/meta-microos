SUMMARY = "Documentation for texlive-japanese-mathformulas"
DESCRIPTION = "This package includes the documentation for texlive-japanese-mathformulas"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.2svn64678"

RPM_NAME = "texlive-japanese-mathformulas-doc-2023.209.1.0.2svn64678-56.1.noarch.rpm"
RPM_HASH = "8b9fbdc4c8ba0ba34fddf860746db79adf184253488ebc179e58529bc7260637731cebd357a3bf5650fd73c5c46f8570e4c5afd1041d267064e444105574bfc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-japanese-mathformulas-doc-ja \
texlive-japanese-mathformulas-doc"

RDEPENDS:${PN} += ""

inherit rpm
