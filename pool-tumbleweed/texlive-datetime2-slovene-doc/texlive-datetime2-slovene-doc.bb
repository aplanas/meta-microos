SUMMARY = "Documentation for texlive-datetime2-slovene"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-slovene"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn52282"

RPM_NAME = "texlive-datetime2-slovene-doc-2023.201.1.1svn52282-52.1.noarch.rpm"
RPM_HASH = "c8b5417a80882f5de767e1b3f0ff466f9fd450a647588a53e049088453079bec25b61f096f4b7f2825975a6648c260593c5c05e4942e5fcd3a7aefd583730bf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-slovene-doc"

RDEPENDS:${PN} += ""

inherit rpm
