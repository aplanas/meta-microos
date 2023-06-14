SUMMARY = "Example Programs for libsndfile"
DESCRIPTION = "This package includes the example programs for libsndfile."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0"

RPM_NAME = "libsndfile-progs-1.2.0-2.1.aarch64.rpm"
RPM_HASH = "9a4070b93d977e590d4aeaa0142c563fe9d3a7690b2012e203c50ec958e1ac9d643a11ef78c9bf085ebcc5936ac864fe49a04c91db65d800567638065e8b318e"

RPROVIDES:${PN} += "libsndfile-progs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libm.so.6 \
libsndfile.so.1"

inherit rpm
