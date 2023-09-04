SUMMARY = "Documentation for texlive-xduts"
DESCRIPTION = "This package includes the documentation for texlive-xduts"
LICENSE = "LPPL-1.0"

PV = "2023.209.6.1.2.0svn66472"

RPM_NAME = "texlive-xduts-doc-2023.209.6.1.2.0svn66472-53.2.noarch.rpm"
RPM_HASH = "2305d1c34ed889bebe12407d356d7c16b501e97b3389200dd28061c8d65d2e8455bf8353c232b5152f4ebe47bdcd208488fe47d12a49f9613c9629d0f440268e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xduts-doc-zh \
texlive-xduts-doc"

RDEPENDS:${PN} += ""

inherit rpm
