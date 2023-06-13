SUMMARY = "Documentation for texlive-autoarea"
DESCRIPTION = "This package includes the documentation for texlive-autoarea"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3asvn59552"

RPM_NAME = "texlive-autoarea-doc-2023.201.0.0.3asvn59552-53.1.noarch.rpm"
RPM_HASH = "d7689eba5130e128d7a4e148443e2fe02d3d2c67c7f86ac882d75e7694d6a80ab5eb0e550ca19054f427c2d0f69b62f182f3fa8737314f503d0f7dbc96f93889"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-autoarea-doc"

RDEPENDS:${PN} += ""

inherit rpm
