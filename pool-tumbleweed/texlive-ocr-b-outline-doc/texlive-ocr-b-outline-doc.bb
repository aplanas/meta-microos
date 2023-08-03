SUMMARY = "Documentation for texlive-ocr-b-outline"
DESCRIPTION = "This package includes the documentation for texlive-ocr-b-outline"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn20969"

RPM_NAME = "texlive-ocr-b-outline-doc-2023.209.svn20969-55.1.noarch.rpm"
RPM_HASH = "4883eebf77918c0f1763231c577e762681555a0050bb7afa57df1962cd1051428f193d6969b265ac6e539cc785f8bf0e664fa6cb362c1dff7e252f8611b748f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ocr-b-outline-doc"

RDEPENDS:${PN} += ""

inherit rpm
