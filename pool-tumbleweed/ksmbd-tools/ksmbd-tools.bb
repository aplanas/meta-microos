SUMMARY = "ksmbd kernel server userspace utilities"
DESCRIPTION = "Set of utilities for creating and managing SMB3 shares for the ksmbd kernel \
module."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.8"

RPM_NAME = "ksmbd-tools-3.4.8-1.1.aarch64.rpm"
RPM_HASH = "21597a333c8ecb6c48b9626ded2a7573709a3a13ec662a1cdf8314d4129db203cb141a04d64cbb998086af25326d9f070210697da8d6a703d0ef4da5ac37f3a0"

RPROVIDES:${PN} += "ksmbd-tools"

RDEPENDS:${PN} += "/bin/sh \
kmod-ksmbd.ko \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libnl-3.so.200 \
libnl-genl-3.so.200"

inherit rpm
