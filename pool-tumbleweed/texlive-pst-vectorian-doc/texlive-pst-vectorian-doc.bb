SUMMARY = "Documentation for texlive-pst-vectorian"
DESCRIPTION = "This package includes the documentation for texlive-pst-vectorian"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.41svn60488"

RPM_NAME = "texlive-pst-vectorian-doc-2023.209.0.0.41svn60488-54.2.noarch.rpm"
RPM_HASH = "d62e9521143c3d2318c4f36331231d75c01035cb502ab4d3974287d59aee8e67e03c8106d9b65fb133e4a112eb496d15c21e42e8b9d727e4d1df86ec2a4ad3bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-vectorian-doc-fr \
texlive-pst-vectorian-doc"

RDEPENDS:${PN} += ""

inherit rpm
