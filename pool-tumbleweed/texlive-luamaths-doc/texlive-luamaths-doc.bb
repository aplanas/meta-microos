SUMMARY = "Documentation for texlive-luamaths"
DESCRIPTION = "This package includes the documentation for texlive-luamaths"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0svn65400"

RPM_NAME = "texlive-luamaths-doc-2023.208.1.0svn65400-53.1.noarch.rpm"
RPM_HASH = "4af974ce4e68a2cc69a5cea3612b1d15d6b03633357a25421748c5a99ce8d405a20d1f8633f0ca6a0f7e518ea5d77085425fec491c35288b9f4d1def34fc35b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luamaths-doc"

RDEPENDS:${PN} += ""

inherit rpm
