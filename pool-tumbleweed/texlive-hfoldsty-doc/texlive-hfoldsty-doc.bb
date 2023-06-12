SUMMARY = "Documentation for texlive-hfoldsty"
DESCRIPTION = "This package includes the documentation for texlive-hfoldsty"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.15svn29349"

RPM_NAME = "texlive-hfoldsty-doc-2023.201.1.15svn29349-53.1.noarch.rpm"
RPM_HASH = "44f6e49891bfea9ba41a1ae54f4dc7980469fac40c5f1d420c9ba5ba1526640956b8b74b582e375dab5d68c08010c1333230db7602b3ba2241c30e5007fbb99e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hfoldsty-doc"
RDEPENDS:${PN} += ""

inherit rpm
