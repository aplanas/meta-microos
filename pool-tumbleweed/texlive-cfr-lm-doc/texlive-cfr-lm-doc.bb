SUMMARY = "Documentation for texlive-cfr-lm"
DESCRIPTION = "This package includes the documentation for texlive-cfr-lm"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn36195"

RPM_NAME = "texlive-cfr-lm-doc-2023.209.1.5svn36195-53.1.noarch.rpm"
RPM_HASH = "bcf380c21ba314bf668ed353d1978b6352333f61079a622283fcd3aa21a275a4993c3b35ca5556a0d87996a42bb2196225c34007d60d9049481a4e3ca2ac994b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cfr-lm-doc"

RDEPENDS:${PN} += ""

inherit rpm
