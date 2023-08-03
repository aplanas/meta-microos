SUMMARY = "Documentation for texlive-lps"
DESCRIPTION = "This package includes the documentation for texlive-lps"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn21322"

RPM_NAME = "texlive-lps-doc-2023.209.0.0.7svn21322-55.1.noarch.rpm"
RPM_HASH = "b04801833a4a5fdeabbb678155cbfbd48b159c9e2929c84a41033c833f14337b581374c708212f7355d168044cd48d18d39ccaabc0a2d3ca9fca9c02ab99eee1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lps-doc"

RDEPENDS:${PN} += ""

inherit rpm
