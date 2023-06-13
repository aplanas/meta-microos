SUMMARY = "Documentation for texlive-make4ht"
DESCRIPTION = "This package includes the documentation for texlive-make4ht"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3msvn66130"

RPM_NAME = "texlive-make4ht-doc-2023.201.0.0.3msvn66130-52.1.noarch.rpm"
RPM_HASH = "66083fc632c9fa927ed69d1415543786e6fb3f639cd6b0af416a96ea14e038b1c53a6349e35c74e8fe889b23386840b8fa3f33cf63526027e1a72aa9200409d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-make4ht-doc"

RDEPENDS:${PN} += ""

inherit rpm
