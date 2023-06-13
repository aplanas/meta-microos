SUMMARY = "Source code of nanopb"
DESCRIPTION = "Source code of nanopb - a C implementation of Google's Protocol Buffers data \
format."
LICENSE = "Zlib"

PV = "0.4.6"

RPM_NAME = "nanopb-source-0.4.6-2.3.noarch.rpm"
RPM_HASH = "c13c2fa1df1bdbc8b7e67d7b22d8593d8d8880d598240d24006e3e366f23710c82db6eec24cf720a0f14e32945517d9943878d003da778954feefba0a34b818d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nanopb-source"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python2 \
/usr/bin/python3"

inherit rpm
