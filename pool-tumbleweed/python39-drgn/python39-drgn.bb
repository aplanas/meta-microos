SUMMARY = "Scriptable debugger library"
DESCRIPTION = "drgn (pronounced “dragon”) is a debugger with an emphasis on \
programmability. drgn exposes the types and variables in a program \
for easy, expressive scripting in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "0.0.24"

RPM_NAME = "python39-drgn-0.0.24-1.1.aarch64.rpm"
RPM_HASH = "072bc6a923ba43de193f9c1f599f43425a91982a18ff5b6b374d7d6718637ef1448e21b26d7b77beca6cb3a51f69c1b59d93a637c25a90f6d76c4fbbe39e633b"

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
