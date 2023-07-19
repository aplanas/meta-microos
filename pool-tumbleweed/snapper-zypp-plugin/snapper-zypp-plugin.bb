SUMMARY = "A zypp commit plugin for calling snapper"
DESCRIPTION = "This package contains a plugin for zypp that makes filesystem snapshots with \
snapper during commits."
LICENSE = "GPL-2.0-only"

PV = "0.10.5"

RPM_NAME = "snapper-zypp-plugin-0.10.5-2.1.aarch64.rpm"
RPM_HASH = "4813200f147b59d9057181c4934be2322d514295fc2be85c0cdef19a746e233ad909a40eec9c79d9f48cd54853580c1fc98a9727f60db40b4df6cbba3e0091e3"

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
