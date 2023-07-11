SUMMARY = "A C library implementing the Cangjie input method"
DESCRIPTION = "libcangjie is a C library implementing the Cangjie input method, \
which is mainly used on Traditional Chinese inputing. \
 \
This package provides runtime library for libcangjie."
LICENSE = "LGPL-3.0+"

PV = "1.3"

RPM_NAME = "libcangjie2-1.3-1.21.aarch64.rpm"
RPM_HASH = "829b31e0e46889e90c5243d5b031820419f8cf6161991eeb1bcf2599f097c01ebf61adc9dbf453f10a82aa7769cf4486f92b5bd6dfa42a1947ab33b197c88f9f"

RPROVIDES:${PN} += "libcangjie.so.2 \
libcangjie2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0"

inherit rpm
