SUMMARY = "Documentation for texlive-kblocks"
DESCRIPTION = "This package includes the documentation for texlive-kblocks"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn57617"

RPM_NAME = "texlive-kblocks-doc-2023.209.2.0svn57617-56.1.noarch.rpm"
RPM_HASH = "f0a9b8d7c24d24aa7de9061798cb32ecbfc9558099cd28ba4fe6ad17542c0106c2c790d880c246d2959b9c06b4af3de6addc67b82c7ef6569d746c2149e97144"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kblocks-doc"

RDEPENDS:${PN} += ""

inherit rpm
