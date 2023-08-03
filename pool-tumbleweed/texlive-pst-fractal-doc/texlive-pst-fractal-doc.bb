SUMMARY = "Documentation for texlive-pst-fractal"
DESCRIPTION = "This package includes the documentation for texlive-pst-fractal"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.12svn64714"

RPM_NAME = "texlive-pst-fractal-doc-2023.209.0.0.12svn64714-53.1.noarch.rpm"
RPM_HASH = "14de986748a56816581b3a556f4071c35ed507114873eb29c074491d95caaffffb2a0b9830827b0b1ea2fe600c91fedd56f82d53a1c2b11f0cdb844aab95bad1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-fractal-doc"

RDEPENDS:${PN} += ""

inherit rpm
