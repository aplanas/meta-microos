SUMMARY = "Documentation for texlive-xint"
DESCRIPTION = "This package includes the documentation for texlive-xint"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4msvn63562"

RPM_NAME = "texlive-xint-doc-2023.209.1.4msvn63562-53.1.noarch.rpm"
RPM_HASH = "fbc4b55c2037626a5a44f79be8e4764f696cb4978876af168d987d0f60e6319b2c153407c433dc88f494335949ecf46cb5f1f50d08214257d61611fed32d83ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xint-doc"

RDEPENDS:${PN} += ""

inherit rpm
