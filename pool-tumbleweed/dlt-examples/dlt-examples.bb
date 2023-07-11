SUMMARY = "DLT - Diagnostic Log and Trace: Examples"
DESCRIPTION = "DLT - Diagnostic Log and Trace: Examples."
LICENSE = "MPL-2.0-no-copyleft-exception"

PV = "2.18.8"

RPM_NAME = "dlt-examples-2.18.8-4.5.aarch64.rpm"
RPM_HASH = "406e2d2a5b9c2d2d6efe4e9ff41efaa7b277f513452ac3b5c31b815fa0231fec48d0206055e4ad8b9794ee95c6aa9c73463a1b45dde94c0f8dc0b777a974b506"

RPROVIDES:${PN} += "dlt-examples"

RDEPENDS:${PN} += "/usr/bin/sh \
dlt-daemon \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdlt.so.2"

inherit rpm
