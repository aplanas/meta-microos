SUMMARY = "Documentation for texlive-pst-barcode"
DESCRIPTION = "This package includes the documentation for texlive-pst-barcode"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.19svn64182"

RPM_NAME = "texlive-pst-barcode-doc-2023.201.0.0.19svn64182-52.1.noarch.rpm"
RPM_HASH = "ce68fb031bb781f20ce9ae58f94b16825aa60d0d29ddff1fda363e9236e2b0e383f82426cb492f30e8e6e59882be36138b2ad92bd52d45d66df793978194de62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-barcode-doc"

RDEPENDS:${PN} += ""

inherit rpm
