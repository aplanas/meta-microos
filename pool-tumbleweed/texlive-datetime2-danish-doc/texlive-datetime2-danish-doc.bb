SUMMARY = "Documentation for texlive-datetime2-danish"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-danish"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn47034"

RPM_NAME = "texlive-datetime2-danish-doc-2023.209.1.1svn47034-53.1.noarch.rpm"
RPM_HASH = "fa485f2a07880622449bde070b4e476d1da24341e2dded715fd29d317b848b68ee8f9e68d4cb10f5c057c898845dfba57e628343731d5829137d2ca91fcdbbf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-danish-doc"

RDEPENDS:${PN} += ""

inherit rpm
