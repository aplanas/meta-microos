SUMMARY = "Documentation for texlive-recipe"
DESCRIPTION = "This package includes the documentation for texlive-recipe"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.9svn54080"

RPM_NAME = "texlive-recipe-doc-2023.209.0.0.9svn54080-54.2.noarch.rpm"
RPM_HASH = "8027807c56085357e5642a4ef37b772d7ec4817d88ecd82af072b635fd149d6f7135953cd071ff15d6f00508376b240efaf93e272e3470036cfdf54925a665b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-recipe-doc-it \
texlive-recipe-doc"

RDEPENDS:${PN} += ""

inherit rpm
