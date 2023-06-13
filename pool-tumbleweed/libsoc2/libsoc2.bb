SUMMARY = "C library for interfacing with common SoC peripherals"
DESCRIPTION = "libsoc is a C library to interface with common peripherals found in System \
on Chips (SoC) through generic Linux Kernel interfaces. \
 \
It targets reliability rather than speed. No guarantees are made \
on its determinism and it should not be used in time critical routines."
LICENSE = "LGPL-2.1-only"

PV = "0.8.2"

RPM_NAME = "libsoc2-0.8.2-3.13.aarch64.rpm"
RPM_HASH = "51dcebed731a938d23150f8847820c40ca9f26e855702f41f8d3ffe687aee2e15807de5a2d9fe5887cff9dd928a96c394c08057866e27057112aa102f72ae65b"

RPROVIDES:${PN} += "libsoc.so.2()(64bit) \
libsoc2 \
libsoc2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
