SUMMARY = "Documentation for texlive-gmutils"
DESCRIPTION = "This package includes the documentation for texlive-gmutils"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.996svn24287"

RPM_NAME = "texlive-gmutils-doc-2023.201.0.0.996svn24287-53.2.noarch.rpm"
RPM_HASH = "a615f182829e6e6106a4c04586974a930cf15be2638c976e1bf48710cdd554118470d03432706bf978abb4fb3935195dddac9d37f19790e7661ed584e8f2ad44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmutils-doc"

RDEPENDS:${PN} += ""

inherit rpm
