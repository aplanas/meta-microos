SUMMARY = "Documentation for texlive-regstats"
DESCRIPTION = "This package includes the documentation for texlive-regstats"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0hsvn25050"

RPM_NAME = "texlive-regstats-doc-2023.209.1.0hsvn25050-54.1.noarch.rpm"
RPM_HASH = "cd136aab12ba06db1d7508c99559ac7e86d2258178e6ff548d0beab64f79498ea97d996396aafbf579699b98952bf657cb3f31a002a6ca4d78eccd88baef2fda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-regstats-doc"

RDEPENDS:${PN} += ""

inherit rpm
