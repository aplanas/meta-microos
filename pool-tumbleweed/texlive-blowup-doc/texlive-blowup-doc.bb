SUMMARY = "Documentation for texlive-blowup"
DESCRIPTION = "This package includes the documentation for texlive-blowup"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.0svn64466"

RPM_NAME = "texlive-blowup-doc-2023.209.2.1.0svn64466-53.1.noarch.rpm"
RPM_HASH = "66c8a41f1f3c346740f61774a3f943751bc6b74eeccd276a404091c9ce1e981d0d878d45da99cc785fde6e7818041bdc26ab13d27b762fc0f80c2d788124ff8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-blowup-doc"

RDEPENDS:${PN} += ""

inherit rpm
