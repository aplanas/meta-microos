SUMMARY = "Development files for the liquid-dsp library"
DESCRIPTION = "liquid-dsp is a signal processing library for software-defined \
radios written in C. Its purpose is to provide a set of extensible DSP modules \
that do no rely on external dependencies or cumbersome frameworks. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libliquid."
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "libliquid-devel-1.3.2-2.3.aarch64.rpm"
RPM_HASH = "4f17e14ef6a7adb5a97b386b67a6731ac0b692e7eea2d69405b381ab4fd0092fac90a3134184977e3d8c5ab69116691aaeb67039fb31337c175e053cf3072f53"

RPROVIDES:${PN} += "libliquid-devel \
libliquid-devel(aarch-64) \
libliquid.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfec.so.3()(64bit) \
libfftw3f.so.3()(64bit) \
libm.so.6()(64bit)"

inherit rpm
