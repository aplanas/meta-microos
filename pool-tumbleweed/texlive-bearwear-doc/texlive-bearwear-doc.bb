SUMMARY = "Documentation for texlive-bearwear"
DESCRIPTION = "This package includes the documentation for texlive-bearwear"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn54826"

RPM_NAME = "texlive-bearwear-doc-2023.201.0.0.2svn54826-53.1.noarch.rpm"
RPM_HASH = "c1abc775f81d0d91944737246954cffa5b90efafdeeaa8b3ef83e4639eb9afe9347b1a1f5f17c1658e9b5e31760d36cab3ca682e36bb2e0fb2378788cf978038"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bearwear-doc"

RDEPENDS:${PN} += ""

inherit rpm
