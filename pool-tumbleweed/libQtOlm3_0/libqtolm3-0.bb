SUMMARY = "Qt wrapper for libolm"
DESCRIPTION = "This is a Qt wrapper for libolm."
LICENSE = "GPL-3.0-only"

PV = "3.0.1"

RPM_NAME = "libQtOlm3_0-3.0.1-1.10.aarch64.rpm"
RPM_HASH = "0a32d85451c3a5adcdfdf582589c7b3138bb4cd42aceb9daf538714f7d5549a4eb3c8651418081a8b118335a1078500ff3796a13fd05c74fb299bf0c90668a2f"

RPROVIDES:${PN} += "libQtOlm.so.3.0 \
libQtOlm3-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libolm.so.3 \
libstdc++.so.6"

inherit rpm
