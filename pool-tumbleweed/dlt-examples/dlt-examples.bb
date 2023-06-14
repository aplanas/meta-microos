SUMMARY = "DLT - Diagnostic Log and Trace: Examples"
DESCRIPTION = "DLT - Diagnostic Log and Trace: Examples."
LICENSE = "MPL-2.0-no-copyleft-exception"

PV = "2.18.8"

RPM_NAME = "dlt-examples-2.18.8-4.4.aarch64.rpm"
RPM_HASH = "13c689c7a854cd477a9159d5f38ce2413056a48ae1b121e7c53b85a28c9e27c80c2ed0b25909c4fccc20fd3bd175b935c4a41e2138d9df64d1189f0c34293018"

RPROVIDES:${PN} += "dlt-examples"

RDEPENDS:${PN} += "/bin/sh \
dlt-daemon \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdlt.so.2"

inherit rpm
