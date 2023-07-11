SUMMARY = "Utilities for inspecting GUID partition tables"
DESCRIPTION = "This subpackage contains the utility programs from libvsgpt to \
inspect GUID partition tables."
LICENSE = "LGPL-3.0-or-later"

PV = "20221029"

RPM_NAME = "libvsgpt-tools-20221029-3.9.aarch64.rpm"
RPM_HASH = "2375b064424d5f037b9cdd649089cb2b1e0ab61c5e9e870f4a5134eb2f787e4c12c00d43ca78ce3b22eaefcea7002ed206cdf7f232b67ba5c2749d8adea3b253"

RPROVIDES:${PN} += "libvsgpt-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfguid.so.1 \
libvsgpt.so.1"

inherit rpm
