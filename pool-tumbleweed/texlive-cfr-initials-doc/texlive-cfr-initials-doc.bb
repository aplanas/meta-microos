SUMMARY = "Documentation for texlive-cfr-initials"
DESCRIPTION = "This package includes the documentation for texlive-cfr-initials"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn61719"

RPM_NAME = "texlive-cfr-initials-doc-2023.201.1.01svn61719-52.1.noarch.rpm"
RPM_HASH = "d1e78efedf665c7630ff124d014c580414af35300905d428db82821b8523c4c04cca8796f62331ef5cc533ece4d6c069ab4cf8fb4abe2297982f81358042babb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cfr-initials-doc"

RDEPENDS:${PN} += ""

inherit rpm
