SUMMARY = "A zypp commit plugin for calling snapper"
DESCRIPTION = "This package contains a plugin for zypp that makes filesystem snapshots with \
snapper during commits."
LICENSE = "GPL-2.0-only"

PV = "0.10.5"

RPM_NAME = "snapper-zypp-plugin-0.10.5-1.1.aarch64.rpm"
RPM_HASH = "e74faa94e395477b4e0d60be9411f8514aadd80713b5881c024576638164ef40b3ec9d1e1029935541b296912082bf1ca3e009d5c929eb9b9d165ff3881092b0"

RPROVIDES:${PN} += "snapper-zypp-plugin"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libgcc-s.so.1 \
libjson-c.so.5 \
libsnapper.so.7 \
libstdc++.so.6 \
libxml2.so.2 \
libzypp-plugin-commit \
snapper"

inherit rpm
