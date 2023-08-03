SUMMARY = "Documentation for texlive-draftwatermark"
DESCRIPTION = "This package includes the documentation for texlive-draftwatermark"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn57099"

RPM_NAME = "texlive-draftwatermark-doc-2023.209.3.0svn57099-53.1.noarch.rpm"
RPM_HASH = "eab33382febf411b997e8f7bedb0e5f7cb322733203ef7c6373477311f666e7f72e76adf0ebfd1379bd18e42f569197a07918f0e72375253f34788aef7fb52ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-draftwatermark-doc"

RDEPENDS:${PN} += ""

inherit rpm
