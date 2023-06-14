SUMMARY = "A library to manage subordinate uid and gid ranges"
DESCRIPTION = "Utility library that provides a way to manage subid ranges."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.13"

RPM_NAME = "libsubid4-4.13-6.1.aarch64.rpm"
RPM_HASH = "2eb137d137e016fda13bbe65a018a8fbe081da79d7a81e52c5f333ea1ab531655f5050b6a9a116bdb9c614ef40888751e8ab865e79385381e0fbd2a801ddd9dd"

RPROVIDES:${PN} += "libsubid.so.4 \
libsubid4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6 \
libselinux.so.1"

inherit rpm
