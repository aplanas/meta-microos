SUMMARY = "Documentation for texlive-psbao"
DESCRIPTION = "This package includes the documentation for texlive-psbao"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn55013"

RPM_NAME = "texlive-psbao-doc-2023.209.1.0svn55013-53.1.noarch.rpm"
RPM_HASH = "f2185a9b2e2598476554e048438a6b5ff1bb304a9f0e67d2ffb1306717a92e32b68a0bcb7cb13ebfd2e41347a8cdb84abee05660b9c5375f9f30f4f4774f2d4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-psbao-doc"

RDEPENDS:${PN} += ""

inherit rpm
