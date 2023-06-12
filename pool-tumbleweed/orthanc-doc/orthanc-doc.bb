SUMMARY = "Documentation files for Orthanc"
DESCRIPTION = "This package includes the documentation and the sample codes available \
for Orthanc. \
It also includes the Python and LUA Scripts, and the documentation to develop \
C/C++ plugins for Orthanc."
LICENSE = "GPL-3.0-or-later"

PV = "1.12.0"

RPM_NAME = "orthanc-doc-1.12.0-1.2.noarch.rpm"
RPM_HASH = "01c1ec7d1207692e1502aa98e22dd2a0017988fda69ddf1ed33ad42fb8bb5055389e300a23ccb8617d9fe375799d0baab4c7894a915f565ba41516680cc9af92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "orthanc-doc"
RDEPENDS:${PN} += ""

inherit rpm
