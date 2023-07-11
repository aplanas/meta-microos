SUMMARY = "A C implementation of Circonus log-linear histograms"
DESCRIPTION = "Shared library for libcircllhist, an implementation of Circonus log-linear \
histograms written in C."
LICENSE = "BSD-3-Clause"

PV = "20180917"

RPM_NAME = "libcircllhist0_0_1-20180917-2.18.aarch64.rpm"
RPM_HASH = "c46addb887e2a6e7691ad9be979cd917ac8f51797c7a8dbc82ba81463bd36626b3cc08e08cef379cc41bc36f504b189b7f25349e5df5b583a0cbc349ecb9dae2"

RPROVIDES:${PN} += "libcircllhist.so.0.0.1 \
libcircllhist0-0-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
