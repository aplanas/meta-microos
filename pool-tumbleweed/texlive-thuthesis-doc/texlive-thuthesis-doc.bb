SUMMARY = "Documentation for texlive-thuthesis"
DESCRIPTION = "This package includes the documentation for texlive-thuthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.7.3.1svn64628"

RPM_NAME = "texlive-thuthesis-doc-2023.209.7.3.1svn64628-55.1.noarch.rpm"
RPM_HASH = "0e73b4f582d772f763026fe97c9a3b8be3ce56c275e2b1cc7d54025a6cc337dbcbf1cfbd7e55853736589266f8dd799a8bdb9309c4ba6007f75206a37a591535"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-thuthesis-doc-zh \
texlive-thuthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
