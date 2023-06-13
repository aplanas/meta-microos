SUMMARY = "Tools for the libcangjie IME"
DESCRIPTION = "libcangjie is a C library implementing the Cangjie input method, which \
is mainly used on Traditional Chinese inputing. \
 \
This package provides tools for libcangjie."
LICENSE = "LGPL-3.0+"

PV = "1.3"

RPM_NAME = "libcangjie-tools-1.3-1.20.aarch64.rpm"
RPM_HASH = "86cd8abcf4e0f86ae682a96264fcebc60f63e2b36051d0cae3c1c6ca63d6193e4bbc7da3f271117c45c35f2fe046ac2766b8afdef19d37eef86e1eaeee489ecb"

RPROVIDES:${PN} += "libcangjie-tools \
libcangjie-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcangjie.so.2()(64bit) \
libcangjie2 \
libsqlite3.so.0()(64bit)"

inherit rpm
