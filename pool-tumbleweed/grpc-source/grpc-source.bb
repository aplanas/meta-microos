SUMMARY = "Source code of gRPC"
DESCRIPTION = "This subpackage contains source code of the gRPC reference implementation."
LICENSE = "Apache-2.0"

PV = "1.56.2"

RPM_NAME = "grpc-source-1.56.2-1.1.noarch.rpm"
RPM_HASH = "41c5e4c0803bd612d65d0fd4b1268ca40c49c5a86866aa0907ba280ff250b6b64cbb9f9d8f6710f4f4dc056bb22ff1021e4d081c64796d3fb60676327e3172b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grpc-source"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/python \
/usr/bin/python3 \
/usr/bin/sh"

inherit rpm
