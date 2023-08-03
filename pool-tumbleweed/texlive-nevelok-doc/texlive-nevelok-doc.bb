SUMMARY = "Documentation for texlive-nevelok"
DESCRIPTION = "This package includes the documentation for texlive-nevelok"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.03svn39029"

RPM_NAME = "texlive-nevelok-doc-2023.209.1.03svn39029-55.1.noarch.rpm"
RPM_HASH = "1370724a492a1197ff1705cb813495a0ee63ef0a93d4775faed6f5b01b444e301c3175f69b1bbeeeea75d6c9900c37ea5030cdf6f5f6dcc99af7c59ffcfbfedf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nevelok-doc"

RDEPENDS:${PN} += ""

inherit rpm
