SUMMARY = "Documentation for texlive-dratex"
DESCRIPTION = "This package includes the documentation for texlive-dratex"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-dratex-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "cf07ee8ac14d3e9efe83152336946228f49038bb914ab266dffd06c8a0e4a63562515f86ba4df739305da3e396f060558325a3a9099565805dd3f7bd6773d04b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dratex-doc"

RDEPENDS:${PN} += ""

inherit rpm
