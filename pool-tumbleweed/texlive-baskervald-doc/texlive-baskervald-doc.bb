SUMMARY = "Documentation for texlive-baskervald"
DESCRIPTION = "This package includes the documentation for texlive-baskervald"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.016svn19490"

RPM_NAME = "texlive-baskervald-doc-2023.209.1.016svn19490-54.1.noarch.rpm"
RPM_HASH = "918d6f12ef5c4ee90d6c4c05778edc11745b8fd9d36e512bef8fe2012a60bb26dc38600fbe1ad1b8a94c93c90b266d8265e12ff079d82b1fcd5be732d24dab9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-baskervald-doc"

RDEPENDS:${PN} += ""

inherit rpm
