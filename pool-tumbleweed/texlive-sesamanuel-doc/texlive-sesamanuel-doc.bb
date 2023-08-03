SUMMARY = "Documentation for texlive-sesamanuel"
DESCRIPTION = "This package includes the documentation for texlive-sesamanuel"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6svn36613"

RPM_NAME = "texlive-sesamanuel-doc-2023.209.0.0.6svn36613-54.1.noarch.rpm"
RPM_HASH = "fd4260110abf74c7e93947aa76cbe11b3de75689d27f3999de81daf5c53c33f725b81303c325d6e501330b10cd22fc6601e4415709aaee6f4459d16b2a33ba83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-sesamanuel-doc-fr \
texlive-sesamanuel-doc"

RDEPENDS:${PN} += ""

inherit rpm
