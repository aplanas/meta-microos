SUMMARY = "Library for the GNU Objective C Compiler"
DESCRIPTION = "The library for the GNU Objective C compiler."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "12.3.0+git1204"

RPM_NAME = "libobjc4-gcc12-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "77cdc4f904c228b7dc8d3c15705b9db9b86a97be9a0c89898909c677008c46e9277192630a4be1bea3cbb5a1e39c71fd5922ba408fc819d1445768cd3fd06978"

RPROVIDES:${PN} += "libobjc.so.4 \
libobjc4 \
libobjc4-gcc12"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
