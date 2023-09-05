SUMMARY = "Development files for the Mesa GL API implementation"
DESCRIPTION = "Development files for the Mesa GL API module which is responsible for \
dispatching all the gl* functions. It is intended to be mainly used by \
the Mesa-libGLES* packages."
LICENSE = "MIT"

PV = "23.1.6"

RPM_NAME = "Mesa-libglapi-devel-23.1.6-356.1.aarch64.rpm"
RPM_HASH = "e82db028ab3bf06f829dc3f79a151dfbc5911fea70b3ade0560bc09c57d36f886a9dceccdd2240673d95e05f5ac5b40607c3abd29fa41cf8c49e7d7cd33f8577"

RPROVIDES:${PN} += "Mesa-libglapi-devel"

RDEPENDS:${PN} += "Mesa-libglapi0"

inherit rpm
