SUMMARY = "Scriptable debugger library"
DESCRIPTION = "drgn (pronounced “dragon”) is a debugger with an emphasis on \
programmability. drgn exposes the types and variables in a program \
for easy, expressive scripting in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "0.0.23"

RPM_NAME = "python39-drgn-0.0.23-1.1.aarch64.rpm"
RPM_HASH = "5d46099e5bfb2edf877286f1b9a0445583f66df6231ddb6d8193b91173b4a1424161649c5b5948a7b93fd66284a4bbaa28be893212634f83e34fab66b3861f3a"

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
