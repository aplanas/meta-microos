SUMMARY = "ksmbd kernel server userspace utilities"
DESCRIPTION = "Set of utilities for creating and managing SMB3 shares for the ksmbd kernel \
module."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.8"

RPM_NAME = "ksmbd-tools-3.4.8-1.2.aarch64.rpm"
RPM_HASH = "1c83a831113a091275f6bdc1f8d7b417fb84771967f92df48ec7ab7f32e3beb8670ba799d61ae52a593486d74e5a73e55e52c075a738ed0e8858accfd744365a"

RPROVIDES:${PN} += "ksmbd-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
kmod-ksmbd.ko \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libnl-3.so.200 \
libnl-genl-3.so.200"

inherit rpm
