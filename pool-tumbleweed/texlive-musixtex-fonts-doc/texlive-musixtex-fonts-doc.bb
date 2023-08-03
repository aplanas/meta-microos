SUMMARY = "Documentation for texlive-musixtex-fonts"
DESCRIPTION = "This package includes the documentation for texlive-musixtex-fonts"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn65517"

RPM_NAME = "texlive-musixtex-fonts-doc-2023.209.svn65517-55.1.noarch.rpm"
RPM_HASH = "327e35ab694c9a73ef1c77a5c0262464895bf98c35eb25a6db4841e15c6047be478996ef5c53655619bb111ea6b613a43082f444e1d80a88ca39960694feb127"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-musixtex-fonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
