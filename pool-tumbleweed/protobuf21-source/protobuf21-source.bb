SUMMARY = "Source code of protobuf"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an efficient yet \
extensible format. Google uses Protocol Buffers for almost all of its internal \
RPC protocols and file formats. \
 \
This package contains source code for Protocol Buffers."
LICENSE = "BSD-3-Clause"

PV = "21.12"

RPM_NAME = "protobuf21-source-21.12-1.1.noarch.rpm"
RPM_HASH = "f71fb78027a90f1dbd64956ea2e525a9b752e289bdd6c3306ee6a98d1d0383032e61b3f36f226fbf1c371b8487a7fc3481ea82500544260f988e429316d66150"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "protobuf21-source"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/node \
/usr/bin/python \
/usr/bin/python2.7 \
/usr/bin/python3 \
/usr/bin/ruby \
/usr/bin/sh"

inherit rpm
