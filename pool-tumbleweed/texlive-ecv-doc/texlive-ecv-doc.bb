SUMMARY = "Documentation for texlive-ecv"
DESCRIPTION = "This package includes the documentation for texlive-ecv"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn24928"

RPM_NAME = "texlive-ecv-doc-2023.209.0.0.3svn24928-54.1.noarch.rpm"
RPM_HASH = "074ac6e84171ca0c78b7f78ed641f52d6937e372c6e97bd8aa5ed019407178f83559783a3a4169e560bbea318c4bd51b664936d00e16396197052ae077007bca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ecv-doc-de;en \
texlive-ecv-doc"

RDEPENDS:${PN} += ""

inherit rpm
