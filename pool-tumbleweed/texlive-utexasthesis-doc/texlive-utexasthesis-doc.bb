SUMMARY = "Documentation for texlive-utexasthesis"
DESCRIPTION = "This package includes the documentation for texlive-utexasthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn48648"

RPM_NAME = "texlive-utexasthesis-doc-2023.209.1.0svn48648-54.1.noarch.rpm"
RPM_HASH = "bbdc795361d7d6caecf36e552b2add1bcd45a9e5453b8684b432aef59262f64d13422f30a53248c2657b9514e164a383e1e36e7ae6ed2a3f0a30b61d99dec847"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-utexasthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
