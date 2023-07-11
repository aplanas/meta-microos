SUMMARY = "API for talking to logic analyzer hardware"
DESCRIPTION = "libsigrok is a shared library written in C which provides the basic API \
for talking to logic analyzer hardware and reading/writing the acquired data \
into various input/output file formats."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.2"

RPM_NAME = "libsigrokcxx4-0.5.2-4.13.aarch64.rpm"
RPM_HASH = "63e597ee1aae54fe03913f2bee5e0ac91e95bc483073cb6bda635c87b2c55a7f6c97a5652a6f53c3969f171a192780c76e480dfef2eb351cca68a4cc8b177b03"

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
