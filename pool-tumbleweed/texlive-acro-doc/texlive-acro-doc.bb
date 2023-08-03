SUMMARY = "Documentation for texlive-acro"
DESCRIPTION = "This package includes the documentation for texlive-acro"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.8svn62925"

RPM_NAME = "texlive-acro-doc-2023.209.3.8svn62925-55.1.noarch.rpm"
RPM_HASH = "85b895c9fc42b0e3e24f843c70febabb920f90cb954791f04c76e3e0163e4ead13852d4befd40566f53413c6c4c06f9c05183b6f04502ea96fc4a2e40b902217"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-acro-doc"

RDEPENDS:${PN} += ""

inherit rpm
