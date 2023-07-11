SUMMARY = "ASEKey USB Token Driver"
DESCRIPTION = "This package contains a driver for the ASEKey USB Token. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package."
LICENSE = "BSD-3-Clause"

PV = "3.7"

RPM_NAME = "pcsc-asekey-3.7-4.11.aarch64.rpm"
RPM_HASH = "96dcdadab23d9eebfa68f6f2d7f3bc745713098cdb8e6e753d66deb7c953921427cc94ab5d26b8e7712401e4ddfbfeca6520bcf41b8c53dbaa1ad350110e54b4"

RPROVIDES:${PN} += "libASEKey.so \
pcsc-asekey"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-0.1.so.4 \
pcsc-lite"

inherit rpm
