SUMMARY = "Documentation for texlive-jadetex"
DESCRIPTION = "This package includes the documentation for texlive-jadetex"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.13svn63654"

RPM_NAME = "texlive-jadetex-doc-2023.209.3.13svn63654-56.1.noarch.rpm"
RPM_HASH = "fccf3e1db8e9ff4aca326629281dc62bbbbcebc111a1c24c0457e80d0093c96d050854e3d7cf9c871b156b879188b5ce2fb3c50a74146e6da297745bdc91c6b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-jadetex.1 \
man-pdfjadetex.1 \
texlive-jadetex-doc"

RDEPENDS:${PN} += ""

inherit rpm
