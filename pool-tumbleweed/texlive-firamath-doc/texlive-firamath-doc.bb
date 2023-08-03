SUMMARY = "Documentation for texlive-firamath"
DESCRIPTION = "This package includes the documentation for texlive-firamath"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.3.4svn56672"

RPM_NAME = "texlive-firamath-doc-2023.209.0.0.3.4svn56672-53.1.noarch.rpm"
RPM_HASH = "6a453ef66614bbd1ea2bf1429385ca496eb2d0fca353822692a57ee05a475a10cea1677b5602eb98919127aacdc63e7f5010d24a2a6eab2c8db0246f4bc7a108"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-firamath-doc"

RDEPENDS:${PN} += ""

inherit rpm
