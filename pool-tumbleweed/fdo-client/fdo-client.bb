SUMMARY = "FIDO Device Onboard Client"
DESCRIPTION = "FDO-Client is a portable implementation of the FIDO Device Onboard Spec. \
This component is portable across multiple environments, \
including to various microprocessors (MPUs) and microcontrollers (MCUs)."
LICENSE = "Apache-2.0"

PV = "1.1.4+git20221209.c8ef757"

RPM_NAME = "fdo-client-1.1.4+git20221209.c8ef757-1.5.aarch64.rpm"
RPM_HASH = "2e353536258b7bf5152a8b2237aa36106fd24bd744b49339cb4c5f3d6e0c9dac55f77795d60ccfff756a98c6bb37433a047ab1af0e7289a660bceb05666e2902"

RPROVIDES:${PN} += "fdo-client"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
openssl"

inherit rpm
