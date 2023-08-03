SUMMARY = "Documentation for texlive-gmutils"
DESCRIPTION = "This package includes the documentation for texlive-gmutils"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.996svn24287"

RPM_NAME = "texlive-gmutils-doc-2023.209.0.0.996svn24287-54.1.noarch.rpm"
RPM_HASH = "2c4cb315285540d3e18659d3afc4564e62ebcbadec6eace7b60053e3f98a2dded50eb6e2a4925de85c2ab6e8b0af1ea7f53448f14620e94c619882f7410d5f33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmutils-doc"

RDEPENDS:${PN} += ""

inherit rpm
