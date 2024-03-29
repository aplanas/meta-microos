SUMMARY = "Core execution tool for unprivileged containers"
DESCRIPTION = "Bubblewrap (/usr/bin/bwrap) is a core execution engine for unprivileged \
containers that works as a setuid binary on kernels without \
user namespaces."
LICENSE = "LGPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "bubblewrap-0.8.0-1.1.aarch64.rpm"
RPM_HASH = "e6d2023b8742548707e8ee8f2d7ace7aa9a7c7d057f0e348ddd10ebd12a82d78b598b8b74f7e9dcd69443d2c4473c01ec1a2568701dd0e25c53d7e90cbfa791a"

RPROVIDES:${PN} += "bubblewrap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libselinux.so.1"

inherit rpm
