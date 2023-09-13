SUMMARY = "Scriptable debugger library"
DESCRIPTION = "drgn (pronounced “dragon”) is a debugger with an emphasis on \
programmability. drgn exposes the types and variables in a program \
for easy, expressive scripting in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "0.0.24"

RPM_NAME = "python310-drgn-0.0.24-1.1.aarch64.rpm"
RPM_HASH = "548b2e57dadd429932954c8705e0fb411c49f2ac4e741401ec6929569e4d9c093976018bd15ef0d017531043498d2521d8441d7dace68e2de99d66252a96f174"

RPROVIDES:${PN} += "python3.10dist-drgn \
python310-drgn \
python3dist-drgn"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdw.so.1 \
libelf.so.1 \
libgomp.so.1 \
libkdumpfile.so.10 \
python-abi"

inherit rpm
