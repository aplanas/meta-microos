SUMMARY = "Documentation for texlive-chemschemex"
DESCRIPTION = "This package includes the documentation for texlive-chemschemex"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn46723"

RPM_NAME = "texlive-chemschemex-doc-2023.201.1.2svn46723-53.1.noarch.rpm"
RPM_HASH = "eae8b650737eee39a32a49a7bffb8b93a2d54cdfb060a8680ad453fba5616003ab5d349d3804ea4e1dedd4f719c37911925b35ee6d19a5ddc2e6d3c5e82acb61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chemschemex-doc"

RDEPENDS:${PN} += ""

inherit rpm
