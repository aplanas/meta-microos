SUMMARY = "Fence agent using sanlock and wdmd"
DESCRIPTION = "Fence agent and daemon for using sanlock and wdmd as a cluster fence agent."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.8.5"

RPM_NAME = "fence-sanlock-3.8.5-1.4.aarch64.rpm"
RPM_HASH = "04e8052102fdbd3d8bb3a071696d645cddc29c883356f52935ec1f84da632b9d2c4a6738a0dc63a8aa844a63ffe383314049613b28fbb10115baa8b506f93faa"

RPROVIDES:${PN} += "fence-sanlock"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsanlock.so.1 \
libwdmd.so.1 \
sanlock"

inherit rpm
