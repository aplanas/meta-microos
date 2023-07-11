SUMMARY = "Documentation files for cal3D"
DESCRIPTION = "This package contains modeling documention and a users guide \
for cal3d."
LICENSE = "LGPL-2.1+"

PV = "0.120"

RPM_NAME = "cal3d-doc-0.120-3.11.aarch64.rpm"
RPM_HASH = "b6adaab69bd45709fed92040e3aae17b9c50f1841877f6d9f622f6c980cfabfb66866e7ad226dddd55d36d2ac4dc6ba99d3440f7ea407474ed7605188f1a9344"

RPROVIDES:${PN} += "cal3d-doc"

RDEPENDS:${PN} += "cal3d"

inherit rpm
