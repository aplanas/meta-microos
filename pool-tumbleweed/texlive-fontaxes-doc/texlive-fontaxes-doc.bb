SUMMARY = "Documentation for texlive-fontaxes"
DESCRIPTION = "This package includes the documentation for texlive-fontaxes"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0esvn55920"

RPM_NAME = "texlive-fontaxes-doc-2023.209.1.0esvn55920-53.1.noarch.rpm"
RPM_HASH = "bd902e659c9ddd773bf02c3b45bd424bfd4dfd3a5c773b2b02338d364dd8c447c3a91c2e48b4d805255fb2129e540a0502e157ba2df99af8d7314bd411b542e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontaxes-doc"

RDEPENDS:${PN} += ""

inherit rpm
