SUMMARY = "Replacement for 'buffer' with many more Features"
DESCRIPTION = "mbuffer is a raplacement for buffer with additional functionality: \
- display of I/O speed \
- optional use of memory mapped I/O for huge buffers \
- multithreaded instead of sharedmemory ipc \
- multi volume support \
- autoloader support \
- networking support \
- compatible command-line options"
LICENSE = "GPL-3.0-or-later"

PV = "20230301"

RPM_NAME = "mbuffer-20230301-1.1.aarch64.rpm"
RPM_HASH = "2eff577780d8f9a5337a98ef942f1b4a29dbd807d80972d79e9f5b68939c9fcd3e0985b3937ab14e355fb76d170074a17a876996ab816c49af97bc4187a5f3c5"

RPROVIDES:${PN} += "mbuffer \
mbuffer(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
