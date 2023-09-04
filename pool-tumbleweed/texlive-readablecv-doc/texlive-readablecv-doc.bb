SUMMARY = "Documentation for texlive-readablecv"
DESCRIPTION = "This package includes the documentation for texlive-readablecv"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn61719"

RPM_NAME = "texlive-readablecv-doc-2023.209.3.0svn61719-54.2.noarch.rpm"
RPM_HASH = "2e8613b30fb48fbd0438d64ecdeb18e9f880264ec5306e3633c12d17ae85b77fb53b5a9643ad066e88c99ad3244dd03c308edeb485fe261f26f541203da2c59c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-readablecv-doc"

RDEPENDS:${PN} += ""

inherit rpm
