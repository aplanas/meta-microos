SUMMARY = "Documentation for texlive-eco"
DESCRIPTION = "This package includes the documentation for texlive-eco"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.3svn29349"

RPM_NAME = "texlive-eco-doc-2023.201.1.3svn29349-53.1.noarch.rpm"
RPM_HASH = "962e786f4c59319dcab7fbd33230fc466d2e63c82c2c6eb16735317b0e0dbd7bc65f312dc72435e084f39c0421c77b5bdcba834c3469734898af2de47feed5f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eco-doc"

RDEPENDS:${PN} += ""

inherit rpm
