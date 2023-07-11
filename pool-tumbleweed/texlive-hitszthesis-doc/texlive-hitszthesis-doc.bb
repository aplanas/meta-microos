SUMMARY = "Documentation for texlive-hitszthesis"
DESCRIPTION = "This package includes the documentation for texlive-hitszthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2.1svn61073"

RPM_NAME = "texlive-hitszthesis-doc-2023.201.3.2.1svn61073-53.2.noarch.rpm"
RPM_HASH = "b95b238b34dbac447fafed8707f80821825a7406edb4fad219e4c3d7019515b1043027db2d7f117d1f3c499e3c94fa171d86266fa53ebac8fbbacdd852be7778"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hitszthesis-doc-zh \
texlive-hitszthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
