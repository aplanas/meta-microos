SUMMARY = "Documentation for texlive-yfonts"
DESCRIPTION = "This package includes the documentation for texlive-yfonts"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn50755"

RPM_NAME = "texlive-yfonts-doc-2023.209.1.4svn50755-53.2.noarch.rpm"
RPM_HASH = "0eb16daf4fc6f2635e26287ade528b3aa99483a034c8e4aa4663e0dad09ae71519cee315945a9ae49f52692aad362ca5815207f5e7c4cf71bbf2000b5fce38fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
