SUMMARY = "A code-searching tool similar to ack, but faster"
DESCRIPTION = "A code searching tool similar to ack, with a focus on speed."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "the_silver_searcher-2.2.0-3.4.aarch64.rpm"
RPM_HASH = "cce0a04d54837af886f6c8973b5be9d6dc5e40280d333c2d109338290fa8a4417c9e561140721af9f0503668c46b6077b109da311225995414586e759aca42f8"

RPROVIDES:${PN} += "the-silver-searcher"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblzma.so.5 \
libpcre.so.1 \
libz.so.1"

inherit rpm
