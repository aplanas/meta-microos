SUMMARY = "Documentation for texlive-zhmetrics-uptex"
DESCRIPTION = "This package includes the documentation for texlive-zhmetrics-uptex"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn40728"

RPM_NAME = "texlive-zhmetrics-uptex-doc-2023.209.1.0svn40728-53.1.noarch.rpm"
RPM_HASH = "f16f0de5fbe80f4bf73e233db01e0ae8092ee00209fbf41bc5f590abf88ad287785241f150c59450b71994862101147ace667253e31819abb4ac0a68b5e9a515"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zhmetrics-uptex-doc"

RDEPENDS:${PN} += "/usr/bin/texlua"

inherit rpm
