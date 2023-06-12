SUMMARY = "Security-oriented fuzzer with various analysis options"
DESCRIPTION = "Security-oriented fuzzer with powerful analysis options. Supports \
evolutionary, feedback-driven fuzzing based on code coverage \
(software and hardware)."
LICENSE = "Apache-2.0"

PV = "2.5"

RPM_NAME = "honggfuzz-2.5-2.3.aarch64.rpm"
RPM_HASH = "50275fde466f72e24ee279f1c4ea24b1a2eeffaf587f75229d4f416a0115a4b9038067451381d8f6953fc9a8a7a0f1d10b8ac191dd286c3800fe115ff04f655e"

RPROVIDES:${PN} += "honggfuzz \
honggfuzz(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libsframe.so.0()(64bit) \
libunwind-aarch64.so.8()(64bit) \
libunwind-ptrace.so.0()(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
