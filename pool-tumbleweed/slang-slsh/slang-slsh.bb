SUMMARY = "Interpreter for S-Lang Scripts"
DESCRIPTION = "slsh is a standalone interpreter of the S-Lang language. It can be used to \
execute scripts, or be run interactively."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.3"

RPM_NAME = "slang-slsh-2.3.3-1.4.aarch64.rpm"
RPM_HASH = "0f51208498cca15bacfb133e4a81dcdd10c60e4b8294b945db1838ddf9c056fa5f37f4ce2645ab0c7fb48ad69aaac9ffa79d289c1ff899020c7f99db49fc3be2"

RPROVIDES:${PN} += "config-slang-slsh \
slang \
slang-slsh"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libonig.so.5 \
libpcre.so.1 \
libpng16.so.16 \
libslang.so.2 \
libz.so.1"

inherit rpm
