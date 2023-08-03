SUMMARY = "Documentation for texlive-simpler-wick"
DESCRIPTION = "This package includes the documentation for texlive-simpler-wick"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn39074"

RPM_NAME = "texlive-simpler-wick-doc-2023.209.1.0.0svn39074-54.1.noarch.rpm"
RPM_HASH = "cafb5cc96cac5d43e5a1c682d04e4f95d09fa5453693f7bf570cdf5afa78eed3073a69a7498ace64a1012ed1856a7d33d399c1f569f52024621843b651ac2510"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simpler-wick-doc"

RDEPENDS:${PN} += ""

inherit rpm
