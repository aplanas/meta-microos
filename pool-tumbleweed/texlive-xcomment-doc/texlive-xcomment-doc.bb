SUMMARY = "Documentation for texlive-xcomment"
DESCRIPTION = "This package includes the documentation for texlive-xcomment"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn20031"

RPM_NAME = "texlive-xcomment-doc-2023.209.1.3svn20031-53.1.noarch.rpm"
RPM_HASH = "6f7bc1ca832e2f7beafa19ca6b7ac97d9ef204cebbd4e5ad0408945953fb11b38f41373cd08778eedd5c2a7f188962fe31712e389a1c0e873c11801b041c496f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcomment-doc"

RDEPENDS:${PN} += ""

inherit rpm
