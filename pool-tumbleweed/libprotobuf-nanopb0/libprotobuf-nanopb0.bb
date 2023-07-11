SUMMARY = "Shared library for nanopb"
DESCRIPTION = "Shared library for nanopb - a C implementation of Google's Protocol Buffers \
data format."
LICENSE = "Zlib"

PV = "0.4.6"

RPM_NAME = "libprotobuf-nanopb0-0.4.6-2.4.aarch64.rpm"
RPM_HASH = "bfb15158c8662760c107596b914dcf7bfac7ea8bdd59f9b2bf48d570022144a69db66189db20bed3d079e2165cd2859043d47fafe9e215b255646f3b0c988b70"

RPROVIDES:${PN} += "libprotobuf-nanopb.so.0 \
libprotobuf-nanopb0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
