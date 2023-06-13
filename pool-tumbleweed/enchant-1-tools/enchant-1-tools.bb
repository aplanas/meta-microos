SUMMARY = "Generic Spell Checking Library - Command Line Tools"
DESCRIPTION = "A library providing an efficient extensible abstraction for dealing \
with different spell checking libraries. \
 \
This package provides command-line tools to interact with enchant."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.1"

RPM_NAME = "enchant-1-tools-1.6.1-6.3.aarch64.rpm"
RPM_HASH = "1270e637d2abb7379d78445c7a72236653f68ed807e6abadea6586f514906474503bfa1d00579d9f83df4757997884e035544bccb6cc2c3fcff519f09e655eb7"

RPROVIDES:${PN} += "enchant-1-tools \
enchant-1-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libenchant.so.1()(64bit) \
libglib-2.0.so.0()(64bit)"

inherit rpm
