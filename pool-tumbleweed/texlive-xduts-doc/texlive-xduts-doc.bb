SUMMARY = "Documentation for texlive-xduts"
DESCRIPTION = "This package includes the documentation for texlive-xduts"
LICENSE = "LPPL-1.0"

PV = "2023.201.6.1.2.0svn66472"

RPM_NAME = "texlive-xduts-doc-2023.201.6.1.2.0svn66472-52.1.noarch.rpm"
RPM_HASH = "7045b23d40290183d35148f28e4d321a84481b7dc143c73da7fecb1fd10abcb0de9f4b819989430fd4ff98d3e902949e07ad45d2ea927740aa4afea5594009bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xduts-doc-zh \
texlive-xduts-doc"

RDEPENDS:${PN} += ""

inherit rpm
