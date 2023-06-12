SUMMARY = "Documentation for texlive-pagerange"
DESCRIPTION = "This package includes the documentation for texlive-pagerange"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn16915"

RPM_NAME = "texlive-pagerange-doc-2023.201.0.0.5svn16915-51.1.noarch.rpm"
RPM_HASH = "1e0fb66bb70efa2fde50c5e832fd28b1aa0b9ee23818edf523bf1469fee34e39ca07f8682182227854e2e9dbbedd0037057c116b42a98083bc1c7b05f64aa152"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pagerange-doc"
RDEPENDS:${PN} += ""

inherit rpm
