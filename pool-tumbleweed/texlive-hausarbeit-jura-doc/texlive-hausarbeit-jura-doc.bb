SUMMARY = "Documentation for texlive-hausarbeit-jura"
DESCRIPTION = "This package includes the documentation for texlive-hausarbeit-jura"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1.0svn56070"

RPM_NAME = "texlive-hausarbeit-jura-doc-2023.201.2.1.0svn56070-53.2.noarch.rpm"
RPM_HASH = "4b45f3d1ef180987a0bd6b5ab82f9ea5ec19d77defe0f68e43ca659694fd2333ed8dbed575da255489f8fdc0d1ebd2237743b0a279773740816daa13f330f7c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hausarbeit-jura-doc-de \
texlive-hausarbeit-jura-doc"

RDEPENDS:${PN} += ""

inherit rpm
