SUMMARY = "Documentation for texlive-chemarrow"
DESCRIPTION = "This package includes the documentation for texlive-chemarrow"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.9svn17146"

RPM_NAME = "texlive-chemarrow-doc-2023.201.0.0.9svn17146-53.1.noarch.rpm"
RPM_HASH = "6f82e17fde9e798258a5b9b01f85925e8497dbed4d0dd64086d8ab7910021c671d00c8cfeaf4e2f71a61ad0544caf7987c5669dd6e1713298ecff5ba79e33488"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-chemarrow-doc:de;en) \
texlive-chemarrow-doc"

RDEPENDS:${PN} += ""

inherit rpm
