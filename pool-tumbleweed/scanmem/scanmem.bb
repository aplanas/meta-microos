SUMMARY = "Interactive debugging utility"
DESCRIPTION = "scanmem is a debugging utility designed to isolate the address of an \
arbitrary variable in an executing process. scanmem simply needs to be told \
the PID of the process, and the value of the variable at several different \
times. After several scans of the process, scanmem isolates the position of \
the variable and allows you to modify its value."
LICENSE = "GPL-3.0-only"

PV = "0.17"

RPM_NAME = "scanmem-0.17-2.13.aarch64.rpm"
RPM_HASH = "43250f13da11770741e78b3f253df278a75300d47a6b905f14ea2a218df6bb8188261c295a6ff5d34b738fcd5f43e6a0b26796306001ac03713fed5c093314a6"

RPROVIDES:${PN} += "libscanmem.so.1()(64bit) \
scanmem \
scanmem(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libreadline.so.8()(64bit)"

inherit rpm
