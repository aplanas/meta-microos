SUMMARY = "Documentation for texlive-pitex"
DESCRIPTION = "This package includes the documentation for texlive-pitex"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn24731"

RPM_NAME = "texlive-pitex-doc-2023.201.svn24731-51.1.noarch.rpm"
RPM_HASH = "319727defa2332b43e25cb803c96c56cd6ebeb0330c1f5eb65310b2ca45ddcba357515e3dcb31349474838d037cad84b87db8a7612828c9063371bb65ee17bc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pitex-doc"

RDEPENDS:${PN} += ""

inherit rpm
