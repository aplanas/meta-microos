SUMMARY = "Documentation for texlive-chemarrow"
DESCRIPTION = "This package includes the documentation for texlive-chemarrow"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.9svn17146"

RPM_NAME = "texlive-chemarrow-doc-2023.209.0.0.9svn17146-54.1.noarch.rpm"
RPM_HASH = "c027ce71a63b0f27e507b0f3530e49da77b27c43417c69e885e745cf5d6feec89e4591de42b1ab37749730607726f56fb99503e0e12efca01cdb1e72ea36f141"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-chemarrow-doc-de;en \
texlive-chemarrow-doc"

RDEPENDS:${PN} += ""

inherit rpm
