SUMMARY = "Documentation for texlive-etex-pkg"
DESCRIPTION = "This package includes the documentation for texlive-etex-pkg"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.7svn41784"

RPM_NAME = "texlive-etex-pkg-doc-2023.201.2.7svn41784-52.1.noarch.rpm"
RPM_HASH = "3d1f62896e31745c24d52fe5441fc3bcaf96ae9017d709dbc1ddd05bf72e1258d549f4d0ab0a907da6526401203d934bbc4bc15f8af924c200841405a9a1cd40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etex-pkg-doc"

RDEPENDS:${PN} += ""

inherit rpm
