SUMMARY = "Documentation for texlive-membranecomputing"
DESCRIPTION = "This package includes the documentation for texlive-membranecomputing"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.1svn64627"

RPM_NAME = "texlive-membranecomputing-doc-2023.201.0.0.2.1svn64627-52.1.noarch.rpm"
RPM_HASH = "7f07ec3b196c2f9d5e43216268a03f0c07d45a036c9ebe313bcaf20149af4cdba895befaa8e248026ff77022050f6b6ea0f084e2191e5eda566e04b6c7f639ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-membranecomputing-doc"
RDEPENDS:${PN} += ""

inherit rpm
