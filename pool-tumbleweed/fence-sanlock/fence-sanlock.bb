SUMMARY = "Fence agent using sanlock and wdmd"
DESCRIPTION = "Fence agent and daemon for using sanlock and wdmd as a cluster fence agent."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.8.5"

RPM_NAME = "fence-sanlock-3.8.5-1.3.aarch64.rpm"
RPM_HASH = "dc66eb24cfe4b4ac08490a220f44ed58c1cb05e94edff74b650b143ab3bdc82343b64d16225631100a4b9acee3795ddbcb02cc385de888ad2bfc6c9e04d64719"

RPROVIDES:${PN} += "fence-sanlock"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsanlock.so.1 \
libwdmd.so.1 \
sanlock"

inherit rpm
