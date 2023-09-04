SUMMARY = "Documentation for texlive-repere"
DESCRIPTION = "This package includes the documentation for texlive-repere"
LICENSE = "LPPL-1.0"

PV = "2023.209.23.02svn65769"

RPM_NAME = "texlive-repere-doc-2023.209.23.02svn65769-54.2.noarch.rpm"
RPM_HASH = "3018c30de875386ce0ba88ccf47c34dff8eba9fe0b2955f28010a9d78bad82f13ce62447427c3877bb6656d62bffe8f803bec857318929eb8fa16f049a2af409"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-repere-doc-fr \
texlive-repere-doc"

RDEPENDS:${PN} += ""

inherit rpm
