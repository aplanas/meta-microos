SUMMARY = "Development files for the liquid-dsp library"
DESCRIPTION = "liquid-dsp is a signal processing library for software-defined \
radios written in C. Its purpose is to provide a set of extensible DSP modules \
that do no rely on external dependencies or cumbersome frameworks. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libliquid."
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "libliquid-devel-1.3.2-2.4.aarch64.rpm"
RPM_HASH = "5142074fb4df298e33a561c18c9f7df3652ec41e91b284cc5e107565938e7060ec1192f59c61666e6502c487270f257030e14811b6e38af407b4c4d3ede0d6da"

RPROVIDES:${PN} += "libliquid-devel \
libliquid.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfec.so.3 \
libfftw3f.so.3 \
libm.so.6"

inherit rpm
