SUMMARY = "Documentation for texlive-wrapfig2"
DESCRIPTION = "This package includes the documentation for texlive-wrapfig2"
LICENSE = "LPPL-1.0"

PV = "2023.201.6.1.1svn66115"

RPM_NAME = "texlive-wrapfig2-doc-2023.201.6.1.1svn66115-52.2.noarch.rpm"
RPM_HASH = "1078aea43bb1ca2a30610710741a0f23f243553dacebc5022a61b7dc9b20878d4b1637827baa6e92be273a2e36b36c5e186d3a69afddecc51e86c1af9c862269"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wrapfig2-doc"

RDEPENDS:${PN} += ""

inherit rpm
