SUMMARY = "Documentation for texlive-xecyr"
DESCRIPTION = "This package includes the documentation for texlive-xecyr"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn54308"

RPM_NAME = "texlive-xecyr-doc-2023.201.1.2svn54308-52.2.noarch.rpm"
RPM_HASH = "27ca7cf3ad29bfa8ba2b4adc51f6f833448b100c42c73adbbf4047f10d2103a9bf56ad4917a81cd2b5dcc05ce8454102344ddd71237c3a49f6bee59474ae1a7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xecyr-doc-ru \
texlive-xecyr-doc"

RDEPENDS:${PN} += ""

inherit rpm
