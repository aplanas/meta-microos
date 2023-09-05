SUMMARY = "SSH2 module for Qore"
DESCRIPTION = "This module provides access to ssh2 sessions and the sftp protocol \
via libssh2 in the Qore programming language."
LICENSE = "GPL-2.0-or-later | LGPL-2.0-or-later | MIT"

PV = "1.4.2"

RPM_NAME = "qore-ssh2-module-1.4.2-1.1.aarch64.rpm"
RPM_HASH = "c0561ef78e9ee32a2ac6a31d1b8cd6f361913c27c8856e12392530c35f0d85ca6e5b72c0ce6ea2ca18c222856fcedc2a8b2c95cb92e9de0eff13ce0b53181e2a"

RPROVIDES:${PN} += "qore-ssh2-module"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libssh2.so.1 \
libstdc++.so.6 \
qore-module-abi"

inherit rpm
