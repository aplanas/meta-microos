SUMMARY = "Osmocom's Media Gateway Control Protocol client library"
DESCRIPTION = "Osmocom's Media Gateway Control Protocol client library."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.9.0"

RPM_NAME = "libosmo-mgcp-client9-1.9.0-1.11.aarch64.rpm"
RPM_HASH = "0ae8412dd73a20f730fd316f017f3ad8026e630c9d6293f90605abcebe023c31f1700129691431204d05a03a4a71cdca08c64c3340a4f34d4d943488662d8c99"

RPROVIDES:${PN} += "libosmo-mgcp-client.so.9 \
libosmo-mgcp-client9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.20 \
libosmovty.so.9 \
libtalloc.so.2"

inherit rpm
