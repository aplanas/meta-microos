SUMMARY = "Documentation for texlive-grayhints"
DESCRIPTION = "This package includes the documentation for texlive-grayhints"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn49052"

RPM_NAME = "texlive-grayhints-doc-2023.201.svn49052-53.2.noarch.rpm"
RPM_HASH = "546141171291903a5b57ee98c4be2fbdc65d001a23ac7b4afc6e9f82fa18acaab8a3703d2faa2878c43bb6f81c72c4e84a45a5b1e919969aaf2dc1f3c0b1c36a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grayhints-doc"

RDEPENDS:${PN} += ""

inherit rpm
