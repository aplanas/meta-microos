SUMMARY = "ksmbd kernel server userspace utilities"
DESCRIPTION = "Set of utilities for creating and managing SMB3 shares for the ksmbd kernel \
module."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.9"

RPM_NAME = "ksmbd-tools-3.4.9-1.1.aarch64.rpm"
RPM_HASH = "7fed4eef5917646a73ae179bedda389dcb22374c5bf08a765511de994885f1b87a3ddcbf8529897830e1a0beab54e2019dd05da6c8cf861199ae8eb9b992044d"

RPROVIDES:${PN} += "ksmbd-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
kmod-ksmbd.ko \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libnl-3.so.200 \
libnl-genl-3.so.200"

inherit rpm
