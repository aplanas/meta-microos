SUMMARY = "Documentation for texlive-roundbox"
DESCRIPTION = "This package includes the documentation for texlive-roundbox"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn29675"

RPM_NAME = "texlive-roundbox-doc-2023.201.0.0.2svn29675-53.1.noarch.rpm"
RPM_HASH = "2954ab16a688d1790af592580c955b8e7343bb028829e93e40aadfe8f69e510ec72e60c29d3e7613b9371df3ab60b53ff54c1ce92e91fc063e1f6e385f5a6228"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-roundbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
