SUMMARY = "Documentation for texlive-authordate"
DESCRIPTION = "This package includes the documentation for texlive-authordate"
LICENSE = "SUSE-TeX"

PV = "2023.201.svn52564"

RPM_NAME = "texlive-authordate-doc-2023.201.svn52564-53.1.noarch.rpm"
RPM_HASH = "8ac213f327c24285898e85c734d17c538f56600a72d3c698c486e1d7dad5bb0e75c5e9819934ae91d8ccaf43d5404e399ec29b1fc4f37200707159a8c29a848e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-authordate-doc"

RDEPENDS:${PN} += ""

inherit rpm
