SUMMARY = "Documentation for texlive-playfair"
DESCRIPTION = "This package includes the documentation for texlive-playfair"
LICENSE = "OFL-1.1"

PV = "2023.209.svn64857"

RPM_NAME = "texlive-playfair-doc-2023.209.svn64857-53.1.noarch.rpm"
RPM_HASH = "64e2c3343df76bca9794556ab6fc6fcc867d01204cb528e258e375b7fb5b2b47f833abffe5879b3eda8aab8b8fd14a69afe34d80a7936c629327fa1d788b4403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-playfair-doc"

RDEPENDS:${PN} += ""

inherit rpm
