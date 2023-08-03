SUMMARY = "Documentation for texlive-context-filter"
DESCRIPTION = "This package includes the documentation for texlive-context-filter"
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn62070"

RPM_NAME = "texlive-context-filter-doc-2023.209.svn62070-55.1.noarch.rpm"
RPM_HASH = "8c13e2e62f6ab67a4d42cb6c0d2b508179f55efa0c47590c607d5cdf63378560681fcbb2ed89368f1e1b10989d6657c813639da85023c5924073bf4941ec95f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-filter-doc"

RDEPENDS:${PN} += ""

inherit rpm
