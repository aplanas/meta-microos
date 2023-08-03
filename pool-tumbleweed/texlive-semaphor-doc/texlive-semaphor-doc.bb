SUMMARY = "Documentation for texlive-semaphor"
DESCRIPTION = "This package includes the documentation for texlive-semaphor"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn18651"

RPM_NAME = "texlive-semaphor-doc-2023.209.svn18651-54.1.noarch.rpm"
RPM_HASH = "53c6f7079f5777327f2ca0576a244c63dd1a190bbabaf29571fd8f108502b5e4f735b766e8f7e1c1371cfa92edefabfa388b57077f1819800d0d70585810152a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-semaphor-doc"

RDEPENDS:${PN} += ""

inherit rpm
