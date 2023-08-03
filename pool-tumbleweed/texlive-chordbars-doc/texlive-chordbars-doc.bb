SUMMARY = "Documentation for texlive-chordbars"
DESCRIPTION = "This package includes the documentation for texlive-chordbars"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn49569"

RPM_NAME = "texlive-chordbars-doc-2023.209.1.1svn49569-54.1.noarch.rpm"
RPM_HASH = "6ad082e02f4935cfc806c21d5268c49611eca616eb6b827e7c41c060f2590ea547a041d68194697bba5c7cd6692b68022f3dd711fc448a37ab8909e4621238ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chordbars-doc"

RDEPENDS:${PN} += ""

inherit rpm
