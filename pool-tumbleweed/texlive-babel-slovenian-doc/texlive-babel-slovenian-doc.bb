SUMMARY = "Documentation for texlive-babel-slovenian"
DESCRIPTION = "This package includes the documentation for texlive-babel-slovenian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2nsvn57666"

RPM_NAME = "texlive-babel-slovenian-doc-2023.209.1.2nsvn57666-54.1.noarch.rpm"
RPM_HASH = "2bda3286e3dafc74204a947160d110feec40fac125e2bda3f83818ef125858bc1ddfbe3b2bab43c12c783aa2140fa5ad7c101431ce0fbc5d99e0c1f560725ab4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-slovenian-doc"

RDEPENDS:${PN} += ""

inherit rpm
