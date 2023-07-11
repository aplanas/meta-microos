SUMMARY = "Security-oriented fuzzer with various analysis options"
DESCRIPTION = "Security-oriented fuzzer with powerful analysis options. Supports \
evolutionary, feedback-driven fuzzing based on code coverage \
(software and hardware)."
LICENSE = "Apache-2.0"

PV = "2.5"

RPM_NAME = "honggfuzz-2.5-2.4.aarch64.rpm"
RPM_HASH = "895530338a71487f96872730946fe79eac3f2a08ba094b80df39a2e7400b2c6409e3d259d11aafde860989d0405f3a0431bc46f470792953fcd5e27b5b86af63"

RPROVIDES:${PN} += "honggfuzz"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsframe.so.0 \
libunwind-aarch64.so.8 \
libunwind-ptrace.so.0 \
libz.so.1 \
libzstd.so.1"

inherit rpm
