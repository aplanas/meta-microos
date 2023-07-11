SUMMARY = "Tools for the libcangjie IME"
DESCRIPTION = "libcangjie is a C library implementing the Cangjie input method, which \
is mainly used on Traditional Chinese inputing. \
 \
This package provides tools for libcangjie."
LICENSE = "LGPL-3.0+"

PV = "1.3"

RPM_NAME = "libcangjie-tools-1.3-1.21.aarch64.rpm"
RPM_HASH = "2b866c4436b7b0bd2acff786cd0ee18c81d38d0e3d019969276563da8fe8b3df8066fc0522625d44a2cf16c4a92f770d100131148ac27c28ae8579b8ba0fb71e"

RPROVIDES:${PN} += "libcangjie-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcangjie.so.2 \
libcangjie2 \
libsqlite3.so.0"

inherit rpm
