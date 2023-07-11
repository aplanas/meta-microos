SUMMARY = "Documentation for texlive-lstbayes"
DESCRIPTION = "This package includes the documentation for texlive-lstbayes"
LICENSE = "LPPL-1.0"

PV = "2023.208.svn48160"

RPM_NAME = "texlive-lstbayes-doc-2023.208.svn48160-53.1.noarch.rpm"
RPM_HASH = "cfa99cacaa9b31fd83feb7082b082895862b20748b3533020c9e07b9e74fdb7e4da47523061b0a1fcce7ccfce4241fb7b242478845b5f21c16b7204dbde3fbfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lstbayes-doc"

RDEPENDS:${PN} += ""

inherit rpm
