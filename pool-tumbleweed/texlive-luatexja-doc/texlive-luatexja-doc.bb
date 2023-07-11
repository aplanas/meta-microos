SUMMARY = "Documentation for texlive-luatexja"
DESCRIPTION = "This package includes the documentation for texlive-luatexja"
LICENSE = "BSD-3-Clause"

PV = "2023.208.20230211.0svn65790"

RPM_NAME = "texlive-luatexja-doc-2023.208.20230211.0svn65790-53.1.noarch.rpm"
RPM_HASH = "dbed1cbb0a826f5848eb34378b6bb3fb619c250e2c693c30209b00247a7077d34a4a8d52be40b66892c8ab5b10b4adc5814270eba617175e76214ecc3bb19687"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-luatexja-doc-en;ja \
texlive-luatexja-doc"

RDEPENDS:${PN} += ""

inherit rpm
