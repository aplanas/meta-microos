SUMMARY = "Interpreter for S-Lang Scripts"
DESCRIPTION = "slsh is a standalone interpreter of the S-Lang language. It can be used to \
execute scripts, or be run interactively."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.3"

RPM_NAME = "slang-slsh-2.3.3-1.3.aarch64.rpm"
RPM_HASH = "1986b649acf23870f8661b3377a1f935758ab6a6642bc5992575a42b3a0f6a376410d23adb88e78bb21711db899a0ccab5f34a3cf2e494c3ece69fc0527f1053"

RPROVIDES:${PN} += "config(slang-slsh) \
slang \
slang-slsh \
slang-slsh(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libonig.so.5()(64bit) \
libpcre.so.1()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libslang.so.2()(64bit) \
libslang.so.2(SLANG2)(64bit) \
libz.so.1()(64bit)"

inherit rpm
