SUMMARY = "Remote temporary filesystem disk plugin for nbdkit"
DESCRIPTION = "This package is a remote temporary filesystem disk plugin for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "nbdkit-tmpdisk-plugin-1.32.2-1.4.aarch64.rpm"
RPM_HASH = "63f0d59093a4ea4b86510f4a374f09d2be45122bac140740c45c3bd3d6606836f3c62caab8baa0ed466cb39a15b3459a508b3d2c2c69fb832336fc1b02016c3b"

RPROVIDES:${PN} += "nbdkit-tmpdisk-plugin"

RDEPENDS:${PN} += "e2fsprogs \
ld-linux-aarch64.so.1 \
libc.so.6 \
nbdkit-server \
util-linux"

inherit rpm
