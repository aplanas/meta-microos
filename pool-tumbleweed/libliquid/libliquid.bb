SUMMARY = "Digital signal processing library for software-defined radios"
DESCRIPTION = "liquid-dsp is a signal processing library for software-defined \
radios written in C. Its purpose is to provide a set of extensible DSP modules \
that do no rely on external dependencies or cumbersome frameworks."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "libliquid-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "4ee66d75027e2f1c976e55a56c64a051b10ecd96fd48eb779e3f59ef5e4ec5846861454be22eb16f19056fb9aa1b698fbe0435353d7efe1df7ee466e9c8b7ef3"

RPROVIDES:${PN} += "libliquid \
libliquid.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfec.so.3 \
libfftw3f.so.3 \
libm.so.6"

inherit rpm
