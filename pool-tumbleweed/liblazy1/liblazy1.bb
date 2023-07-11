SUMMARY = "Liblazy - D-Bus methods provided for convenience"
DESCRIPTION = "Liblazy is a simple and easy to use library that provides convenient \
functions for sending messages over the D-Bus daemon, querying \
information from HAL or asking PolicyKit for a privilege."
LICENSE = "LGPL-2.1+"

PV = "0.2"

RPM_NAME = "liblazy1-0.2-1.26.aarch64.rpm"
RPM_HASH = "b27d662a2a25a3652b4c5d567176d8ac6c6f237efc3070b06d404e24c88edc0e3db20cb9ebbbafadef37f3332f21ec94670875d0229206cefc3b2e27446254cc"

RPROVIDES:${PN} += "liblazy.so.1 \
liblazy1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3"

inherit rpm
