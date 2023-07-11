SUMMARY = "A library to manage subordinate uid and gid ranges"
DESCRIPTION = "Utility library that provides a way to manage subid ranges."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.13"

RPM_NAME = "libsubid4-4.13-6.3.aarch64.rpm"
RPM_HASH = "9caa008c37a779a0599e4ebeaa430deb397546969f278ab13bdd63a84e93dd38731c0af5384aba1479c4b563836e2ed283b446da7f90cc082640752a4995d430"

RPROVIDES:${PN} += "libsubid.so.4 \
libsubid4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6 \
libselinux.so.1"

inherit rpm
