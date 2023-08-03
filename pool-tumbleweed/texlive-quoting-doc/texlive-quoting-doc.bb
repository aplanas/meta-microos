SUMMARY = "Documentation for texlive-quoting"
DESCRIPTION = "This package includes the documentation for texlive-quoting"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1csvn32818"

RPM_NAME = "texlive-quoting-doc-2023.209.0.0.1csvn32818-54.1.noarch.rpm"
RPM_HASH = "0f744f51a0f8acbf020765d913fe2e95e4a11efdef608bc9c689232fc58a150fff86c16df4ba96a118a6b3f097a03147a0a33e30a18ef9bff7b3ca504bc53878"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quoting-doc"

RDEPENDS:${PN} += ""

inherit rpm
