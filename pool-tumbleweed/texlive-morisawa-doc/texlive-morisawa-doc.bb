SUMMARY = "Documentation for texlive-morisawa"
DESCRIPTION = "This package includes the documentation for texlive-morisawa"
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn46946"

RPM_NAME = "texlive-morisawa-doc-2023.209.svn46946-55.1.noarch.rpm"
RPM_HASH = "1fc040144981667751aae8077db2bddbb1086a797d12e6bc01c73fe2499cb6d256f40e786303a020013904c26d88b908205b27da140aa506380e38260c853793"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-morisawa-doc-ja \
texlive-morisawa-doc"

RDEPENDS:${PN} += ""

inherit rpm
