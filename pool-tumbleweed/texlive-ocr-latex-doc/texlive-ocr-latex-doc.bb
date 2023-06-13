SUMMARY = "Documentation for texlive-ocr-latex"
DESCRIPTION = "This package includes the documentation for texlive-ocr-latex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-ocr-latex-doc-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "6773c98b84b48deb8a2d8c324e945b2db61acfc9cd0100769140f9d4ff0ce084c8f38a3dac494c0ce6733bf9dc09be748177243be8ed6f31ee449996f883f8c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ocr-latex-doc"

RDEPENDS:${PN} += ""

inherit rpm
