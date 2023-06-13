SUMMARY = "Documentation for texlive-wsemclassic"
DESCRIPTION = "This package includes the documentation for texlive-wsemclassic"
LICENSE = "BSD-3-Clause"

PV = "2023.201.1.0.1svn31532"

RPM_NAME = "texlive-wsemclassic-doc-2023.201.1.0.1svn31532-52.1.noarch.rpm"
RPM_HASH = "cb9e4975ea5ec443b635068c3f6520b3a9da03792786fc875b8c12f4ca86ee074b68b18aaedf557736229904ef7bc1d31b1e09012f3da0ecfab7bd4d211ec9a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wsemclassic-doc"

RDEPENDS:${PN} += ""

inherit rpm
