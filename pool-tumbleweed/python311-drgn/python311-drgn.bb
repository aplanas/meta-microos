SUMMARY = "Scriptable debugger library"
DESCRIPTION = "drgn (pronounced “dragon”) is a debugger with an emphasis on \
programmability. drgn exposes the types and variables in a program \
for easy, expressive scripting in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "0.0.22"

RPM_NAME = "python311-drgn-0.0.22-1.5.aarch64.rpm"
RPM_HASH = "31b7d894cb29c507c78999673ac9de58857c92364ce9bc5b2dc72828ffbc40204462237aa7e90860113897281c2062af2bcdbc1df4741a65c4c87c973047005e"

RPROVIDES:${PN} += "python3.11dist(drgn) \
python311-drgn \
python311-drgn(aarch-64) \
python3dist(drgn)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdw.so.1()(64bit) \
libelf.so.1()(64bit) \
libgomp.so.1()(64bit) \
libkdumpfile.so.10()(64bit) \
libkdumpfile.so.10(LIBKDUMPFILE_0)(64bit) \
python(abi)"

inherit rpm
