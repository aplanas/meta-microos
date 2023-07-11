SUMMARY = "Source code of nanopb"
DESCRIPTION = "Source code of nanopb - a C implementation of Google's Protocol Buffers data \
format."
LICENSE = "Zlib"

PV = "0.4.6"

RPM_NAME = "nanopb-source-0.4.6-2.4.noarch.rpm"
RPM_HASH = "c3d2064210d2207c35324360184834de155316896d22fde7dcc858eca4fc8f387f8219b2f08df94217d6651165517f8869b11e36f1c486a0c0e9d336e72672d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nanopb-source"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python2 \
/usr/bin/python3 \
/usr/bin/sh"

inherit rpm
