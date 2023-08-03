SUMMARY = "Documentation for texlive-cmupint"
DESCRIPTION = "This package includes the documentation for texlive-cmupint"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn54735"

RPM_NAME = "texlive-cmupint-doc-2023.209.1.1svn54735-54.1.noarch.rpm"
RPM_HASH = "d8f72b95a32d2470d8e757bc33712b1457211a016711397ab54e204e8cb5a984aa40cfe0ea9da5e33788ee77c926c1b95ba1a3e676e3c687f496b1558a0d39d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmupint-doc"

RDEPENDS:${PN} += ""

inherit rpm
