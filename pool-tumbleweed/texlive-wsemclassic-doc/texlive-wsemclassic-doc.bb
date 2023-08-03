SUMMARY = "Documentation for texlive-wsemclassic"
DESCRIPTION = "This package includes the documentation for texlive-wsemclassic"
LICENSE = "BSD-3-Clause"

PV = "2023.209.1.0.1svn31532"

RPM_NAME = "texlive-wsemclassic-doc-2023.209.1.0.1svn31532-53.1.noarch.rpm"
RPM_HASH = "492d71905ccf3179c560368a19866b70866ae865da9dbc99d4c8ba10e47cf8900e203f1e72d0463f302e5d81395bf233ab807c228c6dab1ac98dcf5eb014d676"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wsemclassic-doc"

RDEPENDS:${PN} += ""

inherit rpm
