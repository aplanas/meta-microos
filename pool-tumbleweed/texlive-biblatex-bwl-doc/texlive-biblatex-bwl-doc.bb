SUMMARY = "Documentation for texlive-biblatex-bwl"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-bwl"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn26556"

RPM_NAME = "texlive-biblatex-bwl-doc-2023.201.0.0.02svn26556-53.1.noarch.rpm"
RPM_HASH = "4bcfcd7df2ecae6a34545920837f2600a7f8ecf556f19ac80971df7f0cdf1b4fb84d6ffb7a5993ce07e2b4594f643fe7de123e2bbe91ac6ffd2c07674ede2cda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-bwl-doc"

RDEPENDS:${PN} += ""

inherit rpm
