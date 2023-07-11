SUMMARY = "Source code of gRPC"
DESCRIPTION = "This subpackage contains source code of the gRPC reference implementation."
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "grpc-source-1.56.0-1.2.noarch.rpm"
RPM_HASH = "bd7735820b995e3c3e47944a540fab79bf7c7c9cf3cc09ccf2acf03d03d0b09721b91dd66d8d42527a608a3d715c2e65cb0966e30f51ce746a82176217ff8854"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grpc-source"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/python \
/usr/bin/python3 \
/usr/bin/sh"

inherit rpm
