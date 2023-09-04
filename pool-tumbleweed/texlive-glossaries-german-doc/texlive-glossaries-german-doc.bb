SUMMARY = "Documentation for texlive-glossaries-german"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-german"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-german-doc-2023.209.1.0svn35665-54.2.noarch.rpm"
RPM_HASH = "b401680ed2f22166ebfc07c861d26a437322a99210e4a9df4d75e642ad4924e3571ba9992b71ed52895cbf79e3f859f5eb677626022c52a4bd856ec4905700db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-german-doc"

RDEPENDS:${PN} += ""

inherit rpm
