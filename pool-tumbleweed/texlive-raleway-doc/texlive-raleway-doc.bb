SUMMARY = "Documentation for texlive-raleway"
DESCRIPTION = "This package includes the documentation for texlive-raleway"
LICENSE = "OFL-1.1"

PV = "2023.209.1.4svn42629"

RPM_NAME = "texlive-raleway-doc-2023.209.1.4svn42629-54.1.noarch.rpm"
RPM_HASH = "809a70e9f3714756ec96b8f39d1c683a0f62dd5c73d88c8665eb2eb9d4ea960252f0fb2e5a896210a1bcffff917ffbbac77fae53e05eb81e44c2850d1577f99f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-raleway-doc"

RDEPENDS:${PN} += ""

inherit rpm
