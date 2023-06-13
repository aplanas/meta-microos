SUMMARY = "Documentation for texlive-morisawa"
DESCRIPTION = "This package includes the documentation for texlive-morisawa"
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn46946"

RPM_NAME = "texlive-morisawa-doc-2023.201.svn46946-54.1.noarch.rpm"
RPM_HASH = "20311ac53294af62ebbed4eca699d87e7b86b658579db13e627589209acddd873d79d9c45f9288c915439bcb9ab6e604556d20b3e27c28122e8c5d93780387db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-morisawa-doc:ja) \
texlive-morisawa-doc"

RDEPENDS:${PN} += ""

inherit rpm
