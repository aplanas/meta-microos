SUMMARY = "Documentation for texlive-biblatex-lncs"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-lncs"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6svn65280"

RPM_NAME = "texlive-biblatex-lncs-doc-2023.201.0.0.6svn65280-53.1.noarch.rpm"
RPM_HASH = "c02ca3bae9bd8f40895f9fa5b2e2a3a4ff4de7476f60a2d3506a509b3ac4da6ce8c3dbfdbac6cd391aed42ef84e15c0bd255a358fffff4147111f4d6ebbdb367"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-lncs-doc"

RDEPENDS:${PN} += ""

inherit rpm
