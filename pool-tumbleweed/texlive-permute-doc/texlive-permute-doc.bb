SUMMARY = "Documentation for texlive-permute"
DESCRIPTION = "This package includes the documentation for texlive-permute"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-permute-doc-2023.209.svn15878-52.1.noarch.rpm"
RPM_HASH = "f56e48b68283c7faaa025f961b5da05d7b8d97895a037a539cc0aff9ce19b054907964a4c1186584468acc2b04ba924ad1602246294b010cabfbb10fc10a6b15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-permute-doc"

RDEPENDS:${PN} += ""

inherit rpm
