SUMMARY = "Source code of gRPC"
DESCRIPTION = "This subpackage contains source code of the gRPC reference implementation."
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "grpc-source-1.56.0-1.3.noarch.rpm"
RPM_HASH = "ba0a01a1d00205fbe4fe0f50f52a86ec90b42b54158df0d379526c349066a17b6151ddb3a9b7a7701e4ab0a4b1deac996ab85c982b07e17b3625b17541f57710"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grpc-source"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/python \
/usr/bin/python3 \
/usr/bin/sh"

inherit rpm
