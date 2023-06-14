SUMMARY = "XTRXDSP library"
DESCRIPTION = "DSP specific functions for SDR in general and XTRX in specific."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20190830"

RPM_NAME = "libxtrxdsp0-0.0.0+git.20190830-2.6.aarch64.rpm"
RPM_HASH = "3fe15d2c91dac2ec8b16db1bfffaa496c8bb270e349d4ecbf03c850002143f1b1c106b07f90e1e3de976f3ebbeb918d790f0fcbfce612f242bded9f2de7802dc"

RPROVIDES:${PN} += "libxtrxdsp.so.0 \
libxtrxdsp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
