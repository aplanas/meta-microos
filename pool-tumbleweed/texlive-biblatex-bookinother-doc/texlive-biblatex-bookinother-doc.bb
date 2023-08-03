SUMMARY = "Documentation for texlive-biblatex-bookinother"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-bookinother"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3.3svn54015"

RPM_NAME = "texlive-biblatex-bookinother-doc-2023.209.2.3.3svn54015-54.1.noarch.rpm"
RPM_HASH = "08bbf66aa0920bed4d5bc20d559026ffd1d4c4b0b28cc5aef818b335b103260c20bea8bfa3a970e10ca5a2c5354f2385b5e7789959ef3d0723cc4b1ab37b0b09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-bookinother-doc"

RDEPENDS:${PN} += "/usr/bin/python"

inherit rpm
