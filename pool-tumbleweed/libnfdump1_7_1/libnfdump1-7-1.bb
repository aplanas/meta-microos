SUMMARY = "Shared Library part of libnfdump"
DESCRIPTION = "Shared Library part of libnfdump."
LICENSE = "BSD-3-Clause"

PV = "1.7.1"

RPM_NAME = "libnfdump1_7_1-1.7.1-1.4.aarch64.rpm"
RPM_HASH = "e0953064e31f8232998b8a18e2b346ca3b479913d86e81a50eac88e0730678603fed6c37cc177690a469d112aa9d5e67fc060352e7459d225b370cb9d063d555"

RPROVIDES:${PN} += "libnfdump-1.7.1.so \
libnfdump1-7-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6"

inherit rpm
