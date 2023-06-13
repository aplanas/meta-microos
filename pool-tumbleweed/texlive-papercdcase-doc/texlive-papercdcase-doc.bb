SUMMARY = "Documentation for texlive-papercdcase"
DESCRIPTION = "This package includes the documentation for texlive-papercdcase"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-papercdcase-doc-2023.201.svn15878-51.1.noarch.rpm"
RPM_HASH = "5f2c0ef097e132166a69c2cef8a5d9945ad28c76087547639c7f51f018fe1b1a7169206442b6f0c78217bb20f95391b0a064609cd5108a4640358b55fee6442a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-papercdcase-doc"

RDEPENDS:${PN} += ""

inherit rpm
