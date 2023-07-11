SUMMARY = "DLT - Diagnostic Log and Trace: Tools"
DESCRIPTION = "DLT - Diagnostic Log and Trace: Tools."
LICENSE = "MPL-2.0-no-copyleft-exception"

PV = "2.18.8"

RPM_NAME = "dlt-tools-2.18.8-4.5.aarch64.rpm"
RPM_HASH = "2b492272a5c65824735de9491925e85c16fb77ff57a501303467e8e8a0e3235020f2fdd66556f5ac31dba41b5fea0a57d61fd47555631bbdfae7d1f4b4833541"

RPROVIDES:${PN} += "config-dlt-tools \
dlt-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdlt.so.2 \
libsystemd.so.0"

inherit rpm
