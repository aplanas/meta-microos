SUMMARY = "Documentation for texlive-spot"
DESCRIPTION = "This package includes the documentation for texlive-spot"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn22408"

RPM_NAME = "texlive-spot-doc-2023.209.1.1svn22408-58.1.noarch.rpm"
RPM_HASH = "17554a878b8ad923e4dcf23fdcb891f5fbc2fc78152db3167c980f00875dc253e9ff6b24149478bab8c434ecd67441e11aa5c28c9c6f807a4bcf84446bc1c39e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spot-doc"

RDEPENDS:${PN} += ""

inherit rpm
