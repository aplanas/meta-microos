SUMMARY = "SSH2 module for Qore"
DESCRIPTION = "This module provides access to ssh2 sessions and the sftp protocol \
via libssh2 in the Qore programming language."
LICENSE = "LGPL-2.1-or-later | MIT"

PV = "1.4.1"

RPM_NAME = "qore-ssh2-module-1.4.1-1.10.aarch64.rpm"
RPM_HASH = "7fbeca0b0f1fb6a03cf1634d198e1583412b47fb839c216f09d994352e68ba4849f13c64e99b82c5eea5ee2375bbf8b0bd993f6a24aca1d7732ada2a5a2bea55"

RPROVIDES:${PN} += "qore-ssh2-module"

RDEPENDS:${PN} += "/usr/bin/env \
libc.so.6 \
libgcc-s.so.1 \
libqore.so.12 \
libssh2.so.1 \
libstdc++.so.6 \
qore-module-abi"

inherit rpm
