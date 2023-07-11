SUMMARY = "Command-line utilities for IEC 61883 devices"
DESCRIPTION = "Utilities to inspect and control IEC 61883 hardware."
LICENSE = "GPL-2.0+ & LGPL-2.1+"

PV = "1.2.0"

RPM_NAME = "libiec61883-tools-1.2.0-8.27.aarch64.rpm"
RPM_HASH = "5bb416d17787d231b06670fcab8583faa1f0ffb0aebc215b4b89caba9fd17b7fb5f77423318e303d9bdbb1181d6dfa2796572c86f34c93f5721640826bbdd3cd"

RPROVIDES:${PN} += "libiec61883 \
libiec61883-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libiec61883.so.0 \
libraw1394.so.11"

inherit rpm
