SUMMARY = "Documentation for texlive-pst-exa"
DESCRIPTION = "This package includes the documentation for texlive-pst-exa"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.06svn45289"

RPM_NAME = "texlive-pst-exa-doc-2023.209.0.0.06svn45289-53.1.noarch.rpm"
RPM_HASH = "17131a10b7cc40eb4ae71171ccea95887aa00d1e6f2ce9331e1196ae315fb0d00dee242323d919d2f70acd4b869f5edfed84235af42b416f0c097603b934939f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-exa-doc"

RDEPENDS:${PN} += ""

inherit rpm
