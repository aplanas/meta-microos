SUMMARY = "Documentation for texlive-mathabx"
DESCRIPTION = "This package includes the documentation for texlive-mathabx"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-mathabx-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "60779570f25a8e90c80cf1c4b3a14cc8b09e991793066ae255074347fd9ae2e41f3778ce7462384577d5260965fb5a1406630d8d197a25877aaa436c74b99347"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathabx-doc"

RDEPENDS:${PN} += ""

inherit rpm
