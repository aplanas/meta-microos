SUMMARY = "DLT - Diagnostic Log and Trace: Tools"
DESCRIPTION = "DLT - Diagnostic Log and Trace: Tools."
LICENSE = "MPL-2.0-no-copyleft-exception"

PV = "2.18.8"

RPM_NAME = "dlt-tools-2.18.8-4.6.aarch64.rpm"
RPM_HASH = "8de5eddea10a344e68633ccb02d7b0d498c21f662ba02523a7bcb204bd20253d9ad0e4ec6ad0a57a735247787e77fa73cbc5f5a9048211df21e40f70eb4fcddc"

RPROVIDES:${PN} += "config-dlt-tools \
dlt-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdlt.so.2 \
libsystemd.so.0"

inherit rpm
