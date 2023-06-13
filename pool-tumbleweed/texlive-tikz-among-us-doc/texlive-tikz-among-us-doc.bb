SUMMARY = "Documentation for texlive-tikz-among-us"
DESCRIPTION = "This package includes the documentation for texlive-tikz-among-us"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.0svn60880"

RPM_NAME = "texlive-tikz-among-us-doc-2023.201.1.2.0svn60880-54.1.noarch.rpm"
RPM_HASH = "37ec7d345c1770bde05bf109c4e591d4ded5d8a0d0848fa03dfb1cbe62cb0f89501f8c867f53f2f54d929fc14620977a0b09ecc841f77ab0f0c17c09d0bca57f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-among-us-doc"

RDEPENDS:${PN} += ""

inherit rpm
