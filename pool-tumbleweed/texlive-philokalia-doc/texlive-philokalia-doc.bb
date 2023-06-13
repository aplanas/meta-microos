SUMMARY = "Documentation for texlive-philokalia"
DESCRIPTION = "This package includes the documentation for texlive-philokalia"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn45356"

RPM_NAME = "texlive-philokalia-doc-2023.201.1.2svn45356-51.1.noarch.rpm"
RPM_HASH = "f996d920a9ed5138462bc0fdd8702cb3989b8852db9772888291a9bf24e93454f860bb7084bf629eb85b8df844577d7ef0cd38fac2562b12a21ab23af0de717d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-philokalia-doc"

RDEPENDS:${PN} += ""

inherit rpm
