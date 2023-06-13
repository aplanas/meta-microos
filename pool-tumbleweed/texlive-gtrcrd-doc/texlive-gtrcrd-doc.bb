SUMMARY = "Documentation for texlive-gtrcrd"
DESCRIPTION = "This package includes the documentation for texlive-gtrcrd"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn32484"

RPM_NAME = "texlive-gtrcrd-doc-2023.201.1.1svn32484-53.1.noarch.rpm"
RPM_HASH = "7c7552ba320c56bba55679220e309864c3b2982f5e4ca2ccd653b488384277cd37f1353e790cc04757e5ee7aa4ac00b76dfdcf13672a7bdc89d0e9532630dd41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gtrcrd-doc"

RDEPENDS:${PN} += ""

inherit rpm
