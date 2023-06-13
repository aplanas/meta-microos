SUMMARY = "Shared library for LALSimulation"
DESCRIPTION = "This package provides the shared library for LALSimulation."
LICENSE = "GPL-2.0-only"

PV = "4.0.0"

RPM_NAME = "liblalsimulation31-4.0.0-2.1.aarch64.rpm"
RPM_HASH = "f85712321576b2e9ef8324e78cd8088ef6db3189540cbb6542fc821537bfc1ec4b1ea4759556e523b81cc4374df4cc6a9677840a1d3ea5b4d5e2087d591881a9"

RPROVIDES:${PN} += "liblalsimulation.so.31()(64bit) \
liblalsimulation31 \
liblalsimulation31(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgsl.so.25()(64bit) \
liblal.so.20()(64bit) \
liblalsupport.so.14()(64bit) \
libm.so.6()(64bit)"

inherit rpm
