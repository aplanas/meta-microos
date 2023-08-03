SUMMARY = "Documentation for texlive-pst-barcode"
DESCRIPTION = "This package includes the documentation for texlive-pst-barcode"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.19svn64182"

RPM_NAME = "texlive-pst-barcode-doc-2023.209.0.0.19svn64182-53.1.noarch.rpm"
RPM_HASH = "86123baa254529a7cc16669647fee118ce18f0dc25f1f410fa55aee2db0160ea2e098c3549d75cbe4ba5d4b419759c941fcd83d621a6476f42902927c206d6b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-barcode-doc"

RDEPENDS:${PN} += ""

inherit rpm
