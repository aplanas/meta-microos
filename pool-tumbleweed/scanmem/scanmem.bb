SUMMARY = "Interactive debugging utility"
DESCRIPTION = "scanmem is a debugging utility designed to isolate the address of an \
arbitrary variable in an executing process. scanmem simply needs to be told \
the PID of the process, and the value of the variable at several different \
times. After several scans of the process, scanmem isolates the position of \
the variable and allows you to modify its value."
LICENSE = "GPL-3.0-only"

PV = "0.17"

RPM_NAME = "scanmem-0.17-2.14.aarch64.rpm"
RPM_HASH = "78f1e65dccc76fbceaa4eb93bfadcbb88b8e90031ff4ec9b8ae1f3c05ea6c50660d3fd659eacda08851500a4705e77024bfd365b8626c760aacbf0441df17c6b"

RPROVIDES:${PN} += "libscanmem.so.1 \
scanmem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8"

inherit rpm
