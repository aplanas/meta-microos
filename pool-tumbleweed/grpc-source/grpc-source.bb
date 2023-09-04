SUMMARY = "Source code of gRPC"
DESCRIPTION = "This subpackage contains source code of the gRPC reference implementation."
LICENSE = "Apache-2.0"

PV = "1.57.0"

RPM_NAME = "grpc-source-1.57.0-1.1.noarch.rpm"
RPM_HASH = "b3fe3f098c1dabcde738c162e73ae7c291abb3d16b2dd042af5dbe42423888f3621c63b448945b055975a1db27f373cd792e2e1da42acf581ebbdf804e87b811"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grpc-source"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/python \
/usr/bin/python3 \
/usr/bin/sh"

inherit rpm
