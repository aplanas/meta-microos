SUMMARY = "API for talking to logic analyzer hardware"
DESCRIPTION = "libsigrok is a shared library written in C which provides the basic API \
for talking to logic analyzer hardware and reading/writing the acquired data \
into various input/output file formats."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.2"

RPM_NAME = "libsigrokcxx4-0.5.2-4.12.aarch64.rpm"
RPM_HASH = "551d7828853c16c553fe61f8bff5bacf582362b0183518260db51351a7741a5da67a096471aba01803f908465832864df071292417125fb159160962edb5eebb"

RPROVIDES:${PN} += "libsigrokcxx.so.4 \
libsigrokcxx4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libsigrok-data \
libsigrok.so.4 \
libsigrok4 \
libstdc++.so.6"

inherit rpm
