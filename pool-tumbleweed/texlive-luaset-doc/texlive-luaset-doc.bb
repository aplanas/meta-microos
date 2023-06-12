SUMMARY = "Documentation for texlive-luaset"
DESCRIPTION = "This package includes the documentation for texlive-luaset"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn65376"

RPM_NAME = "texlive-luaset-doc-2023.201.1.0svn65376-52.1.noarch.rpm"
RPM_HASH = "b99db703858bafa703219b2907075234b6633cf5062f7ccb0e1ed616cde9e7e6bca7782dece6ebf8a6545a88fc5aab64c130e171197cc5adc221290fd7b3372b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luaset-doc"
RDEPENDS:${PN} += ""

inherit rpm
