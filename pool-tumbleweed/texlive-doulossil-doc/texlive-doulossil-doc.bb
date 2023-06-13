SUMMARY = "Documentation for texlive-doulossil"
DESCRIPTION = "This package includes the documentation for texlive-doulossil"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.1svn63255"

RPM_NAME = "texlive-doulossil-doc-2023.201.0.0.1svn63255-52.1.noarch.rpm"
RPM_HASH = "c79306b2d11fcb58a1aef7b949ed0842dad815de32552bd61a98ce913ada1e45778fcb30227be8a15e21799e22ca310affae214cb0c71acc970bed40931ae693"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-doulossil-doc"

RDEPENDS:${PN} += ""

inherit rpm
