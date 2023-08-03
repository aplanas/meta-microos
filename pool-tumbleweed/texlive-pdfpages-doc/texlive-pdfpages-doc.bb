SUMMARY = "Documentation for texlive-pdfpages"
DESCRIPTION = "This package includes the documentation for texlive-pdfpages"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5xsvn65319"

RPM_NAME = "texlive-pdfpages-doc-2023.209.0.0.5xsvn65319-52.1.noarch.rpm"
RPM_HASH = "e6e8b9376331fc6773a76244563bd2bea584a45469230cc2457faf15f22eccfae2c154b9e051096c700d4ffc2e0700d27951b89d29ccf79b0178a3fdf48ef832"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfpages-doc"

RDEPENDS:${PN} += ""

inherit rpm
