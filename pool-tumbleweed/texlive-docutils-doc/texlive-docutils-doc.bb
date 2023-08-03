SUMMARY = "Documentation for texlive-docutils"
DESCRIPTION = "This package includes the documentation for texlive-docutils"
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn56594"

RPM_NAME = "texlive-docutils-doc-2023.209.svn56594-53.1.noarch.rpm"
RPM_HASH = "8ab01afb9b6d1f2fd56e4813cd1cacec78320a3d1e7f67012d7cee7ca083005dc6634d96665ad5527a286ada476f5e75b026998efef8eff772dc1c46775862cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-docutils-doc"

RDEPENDS:${PN} += ""

inherit rpm
