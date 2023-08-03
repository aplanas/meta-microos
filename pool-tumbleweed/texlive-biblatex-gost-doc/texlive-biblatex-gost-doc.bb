SUMMARY = "Documentation for texlive-biblatex-gost"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-gost"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.22svn59135"

RPM_NAME = "texlive-biblatex-gost-doc-2023.209.1.22svn59135-54.1.noarch.rpm"
RPM_HASH = "b1c8049fabd849da2fe6164733fd32a8e2e968b322aa424773784ba9e266e051ff4f6032e49a30b89632ed805415628ffc2ed169d9a80d9f0a8813d23273d5b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-biblatex-gost-doc-ru \
texlive-biblatex-gost-doc"

RDEPENDS:${PN} += ""

inherit rpm
