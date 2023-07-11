SUMMARY = "Scriptable debugger library"
DESCRIPTION = "drgn (pronounced “dragon”) is a debugger with an emphasis on \
programmability. drgn exposes the types and variables in a program \
for easy, expressive scripting in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "0.0.23"

RPM_NAME = "python310-drgn-0.0.23-1.1.aarch64.rpm"
RPM_HASH = "cc5f59db6588320d74e840421ca5327b5039bdff903a8faa10ed2ba4e84486073ecf881fcf7039548ad567bf5561245f413b6c455f3a2b57c05565862367e5f9"

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
