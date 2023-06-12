SUMMARY = "Documentation for texlive-nchairx"
DESCRIPTION = "This package includes the documentation for texlive-nchairx"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn60196"

RPM_NAME = "texlive-nchairx-doc-2023.201.1.0.0svn60196-54.1.noarch.rpm"
RPM_HASH = "102988e8f5be1bfccd67e28c899418d96c0263852cc3ca8b93a47e44fcc804c58a1cd6439a70f7061d927e591d6f95dc18b24000e6a09b4d748ff4f446002058"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nchairx-doc"
RDEPENDS:${PN} += ""

inherit rpm
