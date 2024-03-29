SUMMARY = "Library for gaming input devices"
DESCRIPTION = "A shared library initiated by the Roccat Linux driver project."
LICENSE = "GPL-2.0-only & CC-BY-3.0"

PV = "0.15.1"

RPM_NAME = "libgaminggear-0.15.1-3.15.aarch64.rpm"
RPM_HASH = "2edbf6975cd80ea5d699651547a954a20fd320d2d55d95f7f5b193f6b07509901395eaf214ee123bb92c1e3ad3051c000a17f019f5944204106373517b4af110"

RPROVIDES:${PN} += "libgaminggear"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgaminggearfx.so.0 \
libglib-2.0.so.0"

inherit rpm
