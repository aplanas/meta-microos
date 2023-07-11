SUMMARY = "Tools for Working With jigdo Files"
DESCRIPTION = "Jigit is an interactive wrapper around mkimage to ease the download or upgrade \
of existing CDs and CD images."
LICENSE = "GPL-2.0-only"

PV = "1.22"

RPM_NAME = "jigit-1.22-1.11.aarch64.rpm"
RPM_HASH = "9afb42fa0a2273a73794008d1d92d7ae24825b63fd53bbd7293d1bf23f85591d63eedef0f3814c102c14f20a4590355107bed9c86472958b23adeed98ec5b326"

RPROVIDES:${PN} += "jigit"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
