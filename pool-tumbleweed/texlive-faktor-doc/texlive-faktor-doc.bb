SUMMARY = "Documentation for texlive-faktor"
DESCRIPTION = "This package includes the documentation for texlive-faktor"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1bsvn15878"

RPM_NAME = "texlive-faktor-doc-2023.209.0.0.1bsvn15878-53.1.noarch.rpm"
RPM_HASH = "2347bd07514592ca5907792f64b456508dbdf95c44f1b5039f2baa8e2c179fb1187d5bfeb35c499113cea9eb6059fe1456022cfb11d0c81c17f335aa369a1ebc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-faktor-doc-de \
texlive-faktor-doc"

RDEPENDS:${PN} += ""

inherit rpm
