SUMMARY = "Library for gaming input devices"
DESCRIPTION = "A shared library initiated by the Roccat Linux driver project."
LICENSE = "GPL-2.0-only & CC-BY-3.0"

PV = "0.15.1"

RPM_NAME = "libgaminggear-0.15.1-3.15.aarch64.rpm"
RPM_HASH = "2edbf6975cd80ea5d699651547a954a20fd320d2d55d95f7f5b193f6b07509901395eaf214ee123bb92c1e3ad3051c000a17f019f5944204106373517b4af110"

RPROVIDES:${PN} += "libgaminggear \
libgaminggear(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgaminggearfx.so.0()(64bit) \
libglib-2.0.so.0()(64bit)"

inherit rpm
