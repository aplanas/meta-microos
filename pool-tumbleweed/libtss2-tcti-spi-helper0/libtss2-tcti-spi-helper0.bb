SUMMARY = "TCTI spi interface library"
DESCRIPTION = "A TCTI module for communication via SPI TPM device driver. Abstracts \
the details of communication with a TPM via SPI protocol. It uses user \
supplied methods for SPI and timing operations in order to be platform \
independent."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-tcti-spi-helper0-4.0.1-1.4.aarch64.rpm"
RPM_HASH = "c34fe576d4bd8b3e4b6826689d40de4f0fe1e925b35a7f5dfe253934b0d694418e2d1cdf81eada9a4b3a17297beafaf6f35618d36f9eabb1c3bcdca178b996af"

RPROVIDES:${PN} += "libtss2-tcti-spi-helper.so.0 \
libtss2-tcti-spi-helper0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtss2-mu.so.0"

inherit rpm
