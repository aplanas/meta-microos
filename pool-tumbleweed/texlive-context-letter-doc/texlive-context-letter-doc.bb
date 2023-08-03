SUMMARY = "Documentation for texlive-context-letter"
DESCRIPTION = "This package includes the documentation for texlive-context-letter"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn60787"

RPM_NAME = "texlive-context-letter-doc-2023.209.svn60787-55.1.noarch.rpm"
RPM_HASH = "758cc5201c77452770e7f2909697969ed0b2f43bc226a8619ab53b3d6b99407acc1ffddedfcba0671926708b4c88c0cc2373aa321feaa9ea6715fcb4a79c6be6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-letter-doc"

RDEPENDS:${PN} += ""

inherit rpm
