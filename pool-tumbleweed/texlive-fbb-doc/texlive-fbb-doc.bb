SUMMARY = "Documentation for texlive-fbb"
DESCRIPTION = "This package includes the documentation for texlive-fbb"
LICENSE = "OFL-1.1"

PV = "2023.209.1.16svn55728"

RPM_NAME = "texlive-fbb-doc-2023.209.1.16svn55728-53.1.noarch.rpm"
RPM_HASH = "113a178ed4675c751bfad8d10caecdbde985c93015e41c07198539cd3abb88aa8fc0e02a005be5c609d24b9ae1f9f34a903538399b7a26ab6783246ce81a34db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fbb-doc"

RDEPENDS:${PN} += ""

inherit rpm
