SUMMARY = "Documentation for texlive-productbox"
DESCRIPTION = "This package includes the documentation for texlive-productbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn20886"

RPM_NAME = "texlive-productbox-doc-2023.209.1.1svn20886-53.1.noarch.rpm"
RPM_HASH = "3ad5ba8d0a05bf12c2cf4a86ed97498c110ef42aae4b75e8a1c3c7ea42342123fabcf22619adce061ffe363153cd08f6a5edd8dd313333215bdcdab177a26156"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-productbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
