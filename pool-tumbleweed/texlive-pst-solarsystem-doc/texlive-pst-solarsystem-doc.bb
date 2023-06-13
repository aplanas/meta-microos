SUMMARY = "Documentation for texlive-pst-solarsystem"
DESCRIPTION = "This package includes the documentation for texlive-pst-solarsystem"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.13svn45097"

RPM_NAME = "texlive-pst-solarsystem-doc-2023.201.0.0.13svn45097-53.1.noarch.rpm"
RPM_HASH = "f4f9b2f952cbbb6071fe26abded91a279a6e074a41a1bf2cf498586ad1e93f30ad1a7240a642e62f6f2f5cf70fd64ae520aaa2080d59a69dd74c6b082790009c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-solarsystem-doc"

RDEPENDS:${PN} += ""

inherit rpm
