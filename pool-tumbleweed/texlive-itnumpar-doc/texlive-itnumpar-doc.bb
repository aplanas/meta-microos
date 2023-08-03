SUMMARY = "Documentation for texlive-itnumpar"
DESCRIPTION = "This package includes the documentation for texlive-itnumpar"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-itnumpar-doc-2023.209.1.0svn15878-56.1.noarch.rpm"
RPM_HASH = "45c529369702ec204f5ccc6c81eb294c50e44d458389f49eac46af1abbfe9302b49deca2ab3f36cfc1c0d2341140625e51bdb5fa1d93bd46cbcff121e7799c93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-itnumpar-doc"

RDEPENDS:${PN} += ""

inherit rpm
