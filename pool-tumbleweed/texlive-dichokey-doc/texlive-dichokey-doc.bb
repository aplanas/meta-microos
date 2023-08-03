SUMMARY = "Documentation for texlive-dichokey"
DESCRIPTION = "This package includes the documentation for texlive-dichokey"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn17192"

RPM_NAME = "texlive-dichokey-doc-2023.209.svn17192-53.1.noarch.rpm"
RPM_HASH = "1016d89668709013611a805d91a177d92bfd35dcc3a122ee6aad3dd0b1f3a534ad752de77bad0d52d225b665ba00791882552d04760a974b54cc98aa29c7cd46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dichokey-doc"

RDEPENDS:${PN} += ""

inherit rpm
