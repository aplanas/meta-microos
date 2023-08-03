SUMMARY = "Documentation for texlive-context-chromato"
DESCRIPTION = "This package includes the documentation for texlive-context-chromato"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-chromato-doc-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "c37fdec3c701facd393adf72b80ffe62955c945b80082ba4cc2d4ada579f3bc23328fad690313bbfd3839f7886fa95c0e7a5b59c74cf3a521c723e87933c9b51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-chromato-doc"

RDEPENDS:${PN} += ""

inherit rpm
