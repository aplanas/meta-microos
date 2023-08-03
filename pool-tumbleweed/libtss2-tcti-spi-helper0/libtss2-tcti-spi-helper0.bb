SUMMARY = "TCTI spi interface library"
DESCRIPTION = "A TCTI module for communication via SPI TPM device driver. Abstracts \
the details of communication with a TPM via SPI protocol. It uses user \
supplied methods for SPI and timing operations in order to be platform \
independent."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-tcti-spi-helper0-4.0.1-2.1.aarch64.rpm"
RPM_HASH = "6b5c08720d5261ade3c93ddb5a54cf85026c2b9eed68058cb210187b5ffba586ebaff6baafc4f96823830de0c56ca80fe496c01f3172841bcb1247dc2a831695"

RPROVIDES:${PN} += "libtss2-tcti-spi-helper.so.0 \
libtss2-tcti-spi-helper0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtss2-mu.so.0"

inherit rpm
