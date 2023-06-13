SUMMARY = "Documentation for texlive-eltex"
DESCRIPTION = "This package includes the documentation for texlive-eltex"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn15878"

RPM_NAME = "texlive-eltex-doc-2023.201.2.0svn15878-53.1.noarch.rpm"
RPM_HASH = "f5546b4e0ca7fe9939d96d148447c04c5c8456f9d2b7de86f5a27816cf601857f73eaab67cc745a17046e3a2c359b17a9e890f583cca076045f18d999cf9bc75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-eltex-doc:en;cs) \
texlive-eltex-doc"

RDEPENDS:${PN} += ""

inherit rpm
