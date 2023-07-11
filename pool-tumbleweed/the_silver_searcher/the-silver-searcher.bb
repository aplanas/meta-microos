SUMMARY = "A code-searching tool similar to ack, but faster"
DESCRIPTION = "A code searching tool similar to ack, with a focus on speed."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "the_silver_searcher-2.2.0-3.5.aarch64.rpm"
RPM_HASH = "fb646d867b68bbf05bf9f0e9b32e588f4d5b9806701965c72acbbcf7760384d6e139d184d034fdb0470995c95e7f185b08dc87dbbb3eb5bc816dc0f7af819751"

RPROVIDES:${PN} += "the-silver-searcher"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblzma.so.5 \
libpcre.so.1 \
libz.so.1"

inherit rpm
