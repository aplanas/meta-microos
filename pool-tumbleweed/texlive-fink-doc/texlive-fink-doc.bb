SUMMARY = "Documentation for texlive-fink"
DESCRIPTION = "This package includes the documentation for texlive-fink"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2.1svn24329"

RPM_NAME = "texlive-fink-doc-2023.201.2.2.1svn24329-52.1.noarch.rpm"
RPM_HASH = "46f3254f717c8584409b44691da9397c233082f61f96897787c5ac9af53180faf3e1eece25c1e9725a36a6ec08982aadd1961493f6c4ebef7c0e2c894f4d807f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fink-doc"
RDEPENDS:${PN} += ""

inherit rpm
