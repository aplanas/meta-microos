SUMMARY = "Source code of gRPC"
DESCRIPTION = "This subpackage contains source code of the gRPC reference implementation."
LICENSE = "Apache-2.0"

PV = "1.58.0"

RPM_NAME = "grpc-source-1.58.0-1.1.noarch.rpm"
RPM_HASH = "4544c13a8130da635606bb71159525cdb506ab7c9759ae4e7d496d012e41b1519fe974d0a7da23b5f4e592d4a4bca74700a5e8fc847db9a2d1c84564a822d337"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grpc-source"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/python \
/usr/bin/python3 \
/usr/bin/sh"

inherit rpm
