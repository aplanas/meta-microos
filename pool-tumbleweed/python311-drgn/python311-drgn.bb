SUMMARY = "Scriptable debugger library"
DESCRIPTION = "drgn (pronounced “dragon”) is a debugger with an emphasis on \
programmability. drgn exposes the types and variables in a program \
for easy, expressive scripting in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "0.0.24"

RPM_NAME = "python311-drgn-0.0.24-1.1.aarch64.rpm"
RPM_HASH = "c34def06da643b809ebaa4ee331a5b204196f4fe037587b6b84caa5ba4509afe7e30a131f8fc9f5a287a594a6ed49ad89d95e99f20073a428dc8362fc30b84e9"

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
