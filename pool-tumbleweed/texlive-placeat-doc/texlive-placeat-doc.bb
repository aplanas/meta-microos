SUMMARY = "Documentation for texlive-placeat"
DESCRIPTION = "This package includes the documentation for texlive-placeat"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1d1svn45145"

RPM_NAME = "texlive-placeat-doc-2023.201.0.0.1d1svn45145-51.1.noarch.rpm"
RPM_HASH = "4568d08e24455fc5e9bf33aa1f0eca66bcef32df53297a10e2087017a866a33d7fe90a3b627dc1027b1707df0eda8eb8ab0da2c4804b1d75e0a41ca09edc4899"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-placeat-doc"

RDEPENDS:${PN} += ""

inherit rpm
