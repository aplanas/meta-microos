SUMMARY = "Documentation for texlive-cntperchap"
DESCRIPTION = "This package includes the documentation for texlive-cntperchap"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn37572"

RPM_NAME = "texlive-cntperchap-doc-2023.201.0.0.3svn37572-53.1.noarch.rpm"
RPM_HASH = "ec1ec369f6f11a386bea67b7d77980a91dc58ccdc8503d42d13e297a1f691da7d43468470342b2975b6445e1e709792d0d9feb516de9360ee7983c748ac761f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cntperchap-doc"
RDEPENDS:${PN} += ""

inherit rpm
