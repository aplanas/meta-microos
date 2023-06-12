SUMMARY = "Python binding for libfdt"
DESCRIPTION = "libfdt is a library to process Open Firmware style device trees on various \
architectures. \
 \
Python binding part."
LICENSE = "BSD-2-Clause & GPL-2.0-only"

PV = "1.6.1"

RPM_NAME = "python311-pylibfdt-1.6.1-1.8.aarch64.rpm"
RPM_HASH = "d3ce4cc1d07b44249059b5fd547e150587603193870ece7b3dfe29247ce71004c61cbbdcc19906470d3fb0cd791b0a024983a3b62fae47ebb8d8f11865ae36de"

RPROVIDES:${PN} += "python3.11dist(pylibfdt) \
python311-pylibfdt \
python311-pylibfdt(aarch-64) \
python3dist(pylibfdt)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
