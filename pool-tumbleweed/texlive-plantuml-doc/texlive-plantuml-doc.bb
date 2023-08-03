SUMMARY = "Documentation for texlive-plantuml"
DESCRIPTION = "This package includes the documentation for texlive-plantuml"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.1svn55214"

RPM_NAME = "texlive-plantuml-doc-2023.209.0.0.3.1svn55214-52.1.noarch.rpm"
RPM_HASH = "f84bfd0ea26be3ed75f3c94e639426d8758c6d3398d9abd746a53e54fef77c67bc28a46c57627cfb44780da502b8932b693f3f5a8bd43d9b91482ab7f8cf1206"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plantuml-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
