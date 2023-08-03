SUMMARY = "Documentation for texlive-treetex"
DESCRIPTION = "This package includes the documentation for texlive-treetex"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn28176"

RPM_NAME = "texlive-treetex-doc-2023.209.svn28176-53.1.noarch.rpm"
RPM_HASH = "51422e055b82ceb3a5824d0aa12d126424186064bedd4a873ef6066f9d9c92c4c6811c5fb3edb3f14bb02688cbb97486f1f80df4337959d723efaf921800deab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-treetex-doc"

RDEPENDS:${PN} += ""

inherit rpm
