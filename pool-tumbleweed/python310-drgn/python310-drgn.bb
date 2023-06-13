SUMMARY = "Scriptable debugger library"
DESCRIPTION = "drgn (pronounced “dragon”) is a debugger with an emphasis on \
programmability. drgn exposes the types and variables in a program \
for easy, expressive scripting in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "0.0.22"

RPM_NAME = "python310-drgn-0.0.22-1.5.aarch64.rpm"
RPM_HASH = "0421607b371e2e96b655f5dbc137fd2f0f8a325b1bd6951b493c4deadb0ca04570caec14aa63bba2e60cef6b1080fdcc395910a1360cfab71a862e5aadbafa0e"

RPROVIDES:${PN} += "python3-drgn \
python3.10dist(drgn) \
python310-drgn \
python310-drgn(aarch-64) \
python3dist(drgn)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdw.so.1()(64bit) \
libelf.so.1()(64bit) \
libgomp.so.1()(64bit) \
libkdumpfile.so.10()(64bit) \
libkdumpfile.so.10(LIBKDUMPFILE_0)(64bit) \
python(abi)"

inherit rpm
