SUMMARY = "Documentation for texlive-hep-math"
DESCRIPTION = "This package includes the documentation for texlive-hep-math"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64905"

RPM_NAME = "texlive-hep-math-doc-2023.209.1.1svn64905-54.2.noarch.rpm"
RPM_HASH = "c22b76979b5cbe21021b6050809d4196eb14eefccdcf0365e9cf466fc1bf04e9884821d1503f6cfc7b55f422b27619cab660240e1af2878c42728b591f42d5ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
