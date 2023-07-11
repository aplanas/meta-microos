SUMMARY = "Documentation for texlive-wtref"
DESCRIPTION = "This package includes the documentation for texlive-wtref"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4.0svn55558"

RPM_NAME = "texlive-wtref-doc-2023.201.0.0.4.0svn55558-52.2.noarch.rpm"
RPM_HASH = "3c088f1db7cc156ef55634f9756dc8bbc1257cff95256e96d8a8fff62d32b90d9858bfdc943d2e9795344f53de1ca27de9097f3b56dcace85d3c803b7a0d8355"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-wtref-doc-ja \
texlive-wtref-doc"

RDEPENDS:${PN} += ""

inherit rpm
