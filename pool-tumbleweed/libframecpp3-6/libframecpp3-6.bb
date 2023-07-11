SUMMARY = "C++ bindings for ldas-tools"
DESCRIPTION = "This package provides a shared library for ldas-tools-framecpp - a toolkit providing C++ \
bindings for working with frame data."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "libframecpp3-6-2.7.0-2.13.aarch64.rpm"
RPM_HASH = "47278ac63e32dba712b87bf6f5a20c1bf49ebe93fe72137b5b622fc4c04462c61332475b48bfe618bb35467ffd3eb3b6d7700fa4d6646dd40c58aea95fdca76c"

RPROVIDES:${PN} += "libframecpp3-6 \
libframecpp3.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libframecppcmn.so.11 \
libgcc-s.so.1 \
libldastoolsal.so.7 \
libstdc++.so.6"

inherit rpm
