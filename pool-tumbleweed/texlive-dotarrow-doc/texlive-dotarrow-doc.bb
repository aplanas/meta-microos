SUMMARY = "Documentation for texlive-dotarrow"
DESCRIPTION = "This package includes the documentation for texlive-dotarrow"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01asvn15878"

RPM_NAME = "texlive-dotarrow-doc-2023.209.0.0.01asvn15878-53.1.noarch.rpm"
RPM_HASH = "d5b155d4593eb16d017ad21ec5b9c741b9007a404b7c739fb13c07b0a0e9265c43637658d2de33a39c6984c6bf5d1d62f14a5989d9f317905e6dfefb3ca8d925"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dotarrow-doc"

RDEPENDS:${PN} += ""

inherit rpm
