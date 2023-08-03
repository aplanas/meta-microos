SUMMARY = "Documentation for texlive-type1cm"
DESCRIPTION = "This package includes the documentation for texlive-type1cm"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn21820"

RPM_NAME = "texlive-type1cm-doc-2023.209.svn21820-53.1.noarch.rpm"
RPM_HASH = "841cbb77325254e429773a1d7b5564281873148ec728c0e05f6beae09c4611e8961b60b16dd952f02874dc41b7d65e08655fd33ceadd38bb80470123734e3ee7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-type1cm-doc"

RDEPENDS:${PN} += ""

inherit rpm
