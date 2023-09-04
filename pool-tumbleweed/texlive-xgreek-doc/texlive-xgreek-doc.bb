SUMMARY = "Documentation for texlive-xgreek"
DESCRIPTION = "This package includes the documentation for texlive-xgreek"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2.0svn64300"

RPM_NAME = "texlive-xgreek-doc-2023.209.3.2.0svn64300-53.2.noarch.rpm"
RPM_HASH = "cd7256d52151caaad1e4448cd94698ec9b914531b51ee6c49f78a0051b9ea6b3f0f5f641665d1e9cb49bdf3e07eb916d747b76107de41018c8f17d6e80f9eadd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xgreek-doc"

RDEPENDS:${PN} += ""

inherit rpm
