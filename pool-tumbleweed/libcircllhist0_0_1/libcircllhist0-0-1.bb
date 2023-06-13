SUMMARY = "A C implementation of Circonus log-linear histograms"
DESCRIPTION = "Shared library for libcircllhist, an implementation of Circonus log-linear \
histograms written in C."
LICENSE = "BSD-3-Clause"

PV = "20180917"

RPM_NAME = "libcircllhist0_0_1-20180917-2.17.aarch64.rpm"
RPM_HASH = "c8cb4cc7803ea361d8130f6b9d7a8d461b46eb5f48551f5c43453c62f46fb430226c8b8f078e860cc11d4b228e796c36aba02854916a28c2e1f09b028f65eead"

RPROVIDES:${PN} += "libcircllhist.so.0.0.1()(64bit) \
libcircllhist0_0_1 \
libcircllhist0_0_1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
