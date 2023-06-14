SUMMARY = "Documentation for texlive-ecgdraw"
DESCRIPTION = "This package includes the documentation for texlive-ecgdraw"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn41617"

RPM_NAME = "texlive-ecgdraw-doc-2023.201.0.0.1svn41617-53.1.noarch.rpm"
RPM_HASH = "cb6c1994675149016809060583024662dac2da9ba9f10e6c75ae3938b1a2eef3491fdc3505ef5ba0a51d9670f3bb677846361e93397001b3bcc3fa664c88227a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ecgdraw-doc-it \
texlive-ecgdraw-doc"

RDEPENDS:${PN} += ""

inherit rpm
