SUMMARY = "Documentation for texlive-hc"
DESCRIPTION = "This package includes the documentation for texlive-hc"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-hc-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "ffb741e17e06ece7931b416b4a624dd0307fae0e342a8688204613dc2dfe2322e7cd917da4034a70ff225b9c7267350143ef944ef93f91eb2e85fdf67bb378e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hc-doc"

RDEPENDS:${PN} += ""

inherit rpm
