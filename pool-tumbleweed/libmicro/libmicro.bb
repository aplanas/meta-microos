SUMMARY = "LibMicro is a portable set of microbenchmarks"
DESCRIPTION = "LibMicro is a portable set of microbenchmarks that many Solaris \
engineers used during Solaris 10 development to measure the \
performance of various system and library calls."
LICENSE = "CDDL-1.0"

PV = "0.4.2+hg.20120726"

RPM_NAME = "libmicro-0.4.2+hg.20120726-3.14.aarch64.rpm"
RPM_HASH = "2a88f62a0a9adc889a461ecb216ea9519cec154299417b3113af3cce69c7a38263c7d1508e44aec7e001e6a9748995b081707cb35de3715f37db270a174cc4bd"

RPROVIDES:${PN} += "libmicro"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
