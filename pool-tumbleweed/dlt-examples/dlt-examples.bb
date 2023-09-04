SUMMARY = "DLT - Diagnostic Log and Trace: Examples"
DESCRIPTION = "DLT - Diagnostic Log and Trace: Examples."
LICENSE = "MPL-2.0-no-copyleft-exception"

PV = "2.18.8"

RPM_NAME = "dlt-examples-2.18.8-4.6.aarch64.rpm"
RPM_HASH = "4b192f6cf2d8c1d0747722867ca874f8418d87c98a765e0e9e22bbddc29a54aa9289603fd5624dc55e0c6935b3f01f7a4cf39f105897dbc1f2ed46cbf107ec60"

RPROVIDES:${PN} += "dlt-examples"

RDEPENDS:${PN} += "/usr/bin/sh \
dlt-daemon \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdlt.so.2"

inherit rpm
