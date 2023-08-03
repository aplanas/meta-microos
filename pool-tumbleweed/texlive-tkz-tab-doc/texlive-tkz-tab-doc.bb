SUMMARY = "Documentation for texlive-tkz-tab"
DESCRIPTION = "This package includes the documentation for texlive-tkz-tab"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.12csvn66115"

RPM_NAME = "texlive-tkz-tab-doc-2023.209.2.12csvn66115-53.1.noarch.rpm"
RPM_HASH = "62a4d5609863bed91c7743f9d3e4cd9f8964b600ac8b089b254f055dc8e42ad73d1659965cc694468d39c0cc446c683289732b27327398eed992345ca0685a98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tkz-tab-doc-fr \
texlive-tkz-tab-doc"

RDEPENDS:${PN} += ""

inherit rpm
