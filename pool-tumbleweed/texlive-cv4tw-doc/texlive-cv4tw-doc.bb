SUMMARY = "Documentation for texlive-cv4tw"
DESCRIPTION = "This package includes the documentation for texlive-cv4tw"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn34577"

RPM_NAME = "texlive-cv4tw-doc-2023.209.0.0.2svn34577-55.1.noarch.rpm"
RPM_HASH = "806b6fc45ab1bcc86ad15c9affa84de4e33e9bb1564069cb2ffc264dbb5d98cbbc1cc1fce84dbf9ffd559f801734991987300f6ce6938a33fe9e4ddf265f83b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cv4tw-doc"

RDEPENDS:${PN} += ""

inherit rpm
