SUMMARY = "Scriptable debugger library"
DESCRIPTION = "drgn (pronounced “dragon”) is a debugger with an emphasis on \
programmability. drgn exposes the types and variables in a program \
for easy, expressive scripting in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "0.0.22"

RPM_NAME = "python39-drgn-0.0.22-1.5.aarch64.rpm"
RPM_HASH = "080532f9cb9cbccf689f2ac313ba16ccadb33371ad78f2a8b7716feab1114a3083b22e2c0ed2d77fc9c2ba886b010b8ee922ef870d19715e0c0b08506724308e"

RPROVIDES:${PN} += "python3.9dist-drgn \
python39-drgn \
python3dist-drgn"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdw.so.1 \
libelf.so.1 \
libgomp.so.1 \
libkdumpfile.so.10 \
python-abi"

inherit rpm
