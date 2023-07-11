SUMMARY = "Documentation for texlive-efbox"
DESCRIPTION = "This package includes the documentation for texlive-efbox"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn33236"

RPM_NAME = "texlive-efbox-doc-2023.201.1.0svn33236-53.2.noarch.rpm"
RPM_HASH = "edd8493dc38fe7b5d0e7fdee2f9560752b1a5fcfff9c8059915da97e0031e5a80ea0533048db0571a2d37819b43db6cf5ec386761f144e7b9dc5522fde344a1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-efbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
