SUMMARY = "Documentation for texlive-hausarbeit-jura"
DESCRIPTION = "This package includes the documentation for texlive-hausarbeit-jura"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1.0svn56070"

RPM_NAME = "texlive-hausarbeit-jura-doc-2023.201.2.1.0svn56070-53.1.noarch.rpm"
RPM_HASH = "895b06f52a2315325359024cd6f568d4f751cee91eb49695bd403e86397f9a313fbebf4d72fd0be35b963edffe04db30b196ebd894f8bae645672b660154379e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hausarbeit-jura-doc-de \
texlive-hausarbeit-jura-doc"

RDEPENDS:${PN} += ""

inherit rpm
