SUMMARY = "Documentation for texlive-babel-ukrainian"
DESCRIPTION = "This package includes the documentation for texlive-babel-ukrainian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4esvn56674"

RPM_NAME = "texlive-babel-ukrainian-doc-2023.201.1.4esvn56674-53.1.noarch.rpm"
RPM_HASH = "d52f6b4e3cca98ce10bf6ea68257b2cb8ef882fa0d53c9215f6587cf0e5b5e374062425728b164b030b71d7f6a461bd35753f24420ab6a51c67735857c85e321"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-ukrainian-doc"

RDEPENDS:${PN} += ""

inherit rpm
