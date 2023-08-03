SUMMARY = "Documentation for texlive-calcage"
DESCRIPTION = "This package includes the documentation for texlive-calcage"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.90svn27725"

RPM_NAME = "texlive-calcage-doc-2023.209.0.0.90svn27725-53.1.noarch.rpm"
RPM_HASH = "f9dfe5abfca5a3df1d2e16d3368ff50fb357178adb8c216191b7d7236ccc79800a18d57756098a33e43806d9a119f0868fd124644b7a328e79a0a0f224d92f42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-calcage-doc"

RDEPENDS:${PN} += ""

inherit rpm
