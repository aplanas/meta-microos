SUMMARY = "Documentation for texlive-newspaper"
DESCRIPTION = "This package includes the documentation for texlive-newspaper"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-newspaper-doc-2023.209.1.0svn15878-55.1.noarch.rpm"
RPM_HASH = "c88f7e40ff42d06a228425544de59b9277398235d36df46420423568dc5ae369a478bf87cf40dd9b2f516ecd90b1dee578eb22ff3be68fdc8a891ddb62c43136"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newspaper-doc"

RDEPENDS:${PN} += ""

inherit rpm
