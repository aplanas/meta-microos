SUMMARY = "Documentation for texlive-pdfscreen"
DESCRIPTION = "This package includes the documentation for texlive-pdfscreen"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn42428"

RPM_NAME = "texlive-pdfscreen-doc-2023.201.1.5svn42428-51.1.noarch.rpm"
RPM_HASH = "6b1bc1f5543130e1f3f455f0d44b34f239cb28074c1b0c04f47096b3dcfef6a6efaf59b4750b56aac9d16d2e24cbb8a4ca9f0609bc58a00cc05679f611e908cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfscreen-doc"

RDEPENDS:${PN} += ""

inherit rpm
