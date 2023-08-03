SUMMARY = "Documentation for texlive-isomath"
DESCRIPTION = "This package includes the documentation for texlive-isomath"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6.1svn27654"

RPM_NAME = "texlive-isomath-doc-2023.209.0.0.6.1svn27654-56.1.noarch.rpm"
RPM_HASH = "08157f48b9f6607ee710c017936fd3b072cd65d68b92a53b4dd2a9f55d40c560c320a719da21e610db9293a0818dc01aacb3413c8ea9033eeaba521a5e147d6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-isomath-doc"

RDEPENDS:${PN} += ""

inherit rpm
