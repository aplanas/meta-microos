SUMMARY = "Utilities for NILFS"
DESCRIPTION = "This package contains utility programs for NILFS v2."
LICENSE = "GPL-2.0-only"

PV = "2.2.9"

RPM_NAME = "nilfs-utils-2.2.9-1.5.aarch64.rpm"
RPM_HASH = "1bab8c41f09e8887853174949926699c919f4fc53d8604226c9893df38e876b35da4f95a58f7671db7d7405857325001f8db597a271851dc547e62abf8338156"

RPROVIDES:${PN} += "config-nilfs-utils \
nilfs-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libmount.so.1 \
libnilfs.so.0 \
libnilfscleaner.so.0 \
libnilfsgc.so.0 \
libuuid.so.1"

inherit rpm
