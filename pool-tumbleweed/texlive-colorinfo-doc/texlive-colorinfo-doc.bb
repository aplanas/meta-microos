SUMMARY = "Documentation for texlive-colorinfo"
DESCRIPTION = "This package includes the documentation for texlive-colorinfo"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3csvn15878"

RPM_NAME = "texlive-colorinfo-doc-2023.209.0.0.3csvn15878-54.1.noarch.rpm"
RPM_HASH = "5bb4f6d81b642330b793cc85521626502388611aa25752f7b64ab47fb4b8f558ed0dd14aa335255a08dfb5aff22abde3792c10215c0a329bbc27e885f9e8a823"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colorinfo-doc"

RDEPENDS:${PN} += ""

inherit rpm
