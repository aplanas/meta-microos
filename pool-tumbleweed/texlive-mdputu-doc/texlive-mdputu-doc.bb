SUMMARY = "Documentation for texlive-mdputu"
DESCRIPTION = "This package includes the documentation for texlive-mdputu"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.2svn20298"

RPM_NAME = "texlive-mdputu-doc-2023.208.1.2svn20298-53.1.noarch.rpm"
RPM_HASH = "cdb230e683a80f531ecbe66f009b1727574f0e2f11b366a6dbd837d1b1a75f06d90c3e3fcce7597da164ca25ff6409c0eab0311cc4deefa476b1ce44b2c65b46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mdputu-doc"

RDEPENDS:${PN} += ""

inherit rpm
