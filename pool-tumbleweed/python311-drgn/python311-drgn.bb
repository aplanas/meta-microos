SUMMARY = "Scriptable debugger library"
DESCRIPTION = "drgn (pronounced “dragon”) is a debugger with an emphasis on \
programmability. drgn exposes the types and variables in a program \
for easy, expressive scripting in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "0.0.23"

RPM_NAME = "python311-drgn-0.0.23-1.1.aarch64.rpm"
RPM_HASH = "827cbe01463aa1065b969a491732badd3edbc10e779bb457e4c506a16fac96cc7b56e07d7594724f13e85c0b129001bb1f631ff6aa0ca5ea6a3b389259adb2ec"

RPROVIDES:${PN} += "python3-drgn \
python3.11dist-drgn \
python311-drgn \
python3dist-drgn"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdw.so.1 \
libelf.so.1 \
libgomp.so.1 \
libkdumpfile.so.10 \
python-abi"

inherit rpm
