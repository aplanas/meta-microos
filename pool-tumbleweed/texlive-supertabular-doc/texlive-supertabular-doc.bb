SUMMARY = "Documentation for texlive-supertabular"
DESCRIPTION = "This package includes the documentation for texlive-supertabular"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.1gsvn53658"

RPM_NAME = "texlive-supertabular-doc-2023.209.4.1gsvn53658-58.1.noarch.rpm"
RPM_HASH = "8786fe38f82041918f5dfc432dec3eabca54f88f9f283613777d2d03e482f5041b72f14915665710938d1b55a59b2e53fe986818d92b534f791bca4785703210"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-supertabular-doc"

RDEPENDS:${PN} += ""

inherit rpm
