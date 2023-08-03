SUMMARY = "Documentation for texlive-blockdraw_mp"
DESCRIPTION = "This package includes the documentation for texlive-blockdraw_mp"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-blockdraw_mp-doc-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "237d868317e57d949e75097cba9f8ee3c6c73072f6498f6741a4545fe8eb2620e042a74428713c7824c7cdd1f0756c61b11f661024659ee42fab6aee19536912"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-blockdraw-mp-doc"

RDEPENDS:${PN} += ""

inherit rpm
