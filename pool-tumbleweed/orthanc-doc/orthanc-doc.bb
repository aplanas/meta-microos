SUMMARY = "Documentation files for Orthanc"
DESCRIPTION = "This package includes the documentation and the sample codes available \
for Orthanc. \
It also includes the Python and LUA Scripts, and the documentation to develop \
C/C++ plugins for Orthanc."
LICENSE = "GPL-3.0-or-later"

PV = "1.12.1"

RPM_NAME = "orthanc-doc-1.12.1-1.1.noarch.rpm"
RPM_HASH = "bdb6cff79f6b1022dd103efbfb3de447364c221a3faf8bccdc52302222241c569df384f544d47c50099727524e7eb16cb8f1051b86ee9c2ac1159a1ac32d55d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "orthanc-doc"

RDEPENDS:${PN} += ""

inherit rpm
