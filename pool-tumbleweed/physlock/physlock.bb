SUMMARY = "Lightweight linux console locking tool"
DESCRIPTION = "Control physical access to a linux computer by locking all of its virtual \
terminals / consoles. \
 \
physlock is an alternative to vlock, it is equivalent to `vlock -an'. It is \
written because vlock blocks some linux kernel mechanisms like hibernate and \
suspend and can therefore only be used with some limitations. physlock is \
designed to be more lightweight, it does not have a plugin interface and it is \
not started using a shell script wrapper. \
 \
With permission mode easy all users, which are members of the group called \
trusted, can use physlock as well."
LICENSE = "GPL-2.0-only"

PV = "13"

RPM_NAME = "physlock-13-2.3.aarch64.rpm"
RPM_HASH = "75348015115f4896959494bcfb03b8119f1a0f963490f78df7e1224c638ad899aec35fdfa4b796676d35eed3753a0ccd1302ba23c4ef6d29d907be4c9360e2d1"

RPROVIDES:${PN} += "physlock"

RDEPENDS:${PN} += "/usr/bin/sh \
group-trusted \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpam-misc.so.0 \
libpam.so.0 \
libsystemd.so.0 \
permissions"

inherit rpm
