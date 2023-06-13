SUMMARY = "Documentation for texlive-biblatex-historian"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-historian"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn19787"

RPM_NAME = "texlive-biblatex-historian-doc-2023.201.0.0.4svn19787-53.1.noarch.rpm"
RPM_HASH = "8342b0a8f594353bba781e21ee6a216715649ba9a80eeccc1438da2c33384c01b05c35f5afcc14cab8a9dd4e1be7d57ed6c4bcaa3a295867c1aece83d2a34590"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-historian-doc"

RDEPENDS:${PN} += ""

inherit rpm
