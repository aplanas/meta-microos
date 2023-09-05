SUMMARY = "Digital signal processing library for software-defined radios"
DESCRIPTION = "liquid-dsp is a signal processing library for software-defined \
radios written in C. Its purpose is to provide a set of extensible DSP modules \
that do no rely on external dependencies or cumbersome frameworks."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "libliquid-1.6.0-2.1.aarch64.rpm"
RPM_HASH = "441506c97bcc30e7d5aa2df2b0f7061ff6aaab7856f13ee3af13ff4f5c879d0178535d89c4464d2abac041aab5ccfadb4ad7b3b9597f0f5e2c982e03246f4232"

RPROVIDES:${PN} += "libliquid \
libliquid.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfec.so.3 \
libfftw3f.so.3 \
libm.so.6"

inherit rpm
