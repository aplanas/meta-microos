SUMMARY = "M-bus Library"
DESCRIPTION = "libmbus is an open source library for the M-bus (Meter-Bus) protocol. \
 \
The Meter-Bus is a standard for reading out meter data from electricity meters, heat meters, gas meters, etc. The M-bus standard deals with both the electrical signals on the M-Bus, and the protocol and data format used in transmissions on the M-Bus. The role of libmbus is to decode/encode M-bus data, and to handle the communication with M-Bus devices."
LICENSE = "BSD-3-Clause"

PV = "0.9.0+59"

RPM_NAME = "libmbus0-0.9.0+59-1.4.aarch64.rpm"
RPM_HASH = "89cf985d32f2e3a95f42e2af87e0f12f7405b7f0c10f85534ccc6e3f6f7552ba68a768e065db65bae0cfaabf40d0b2057a986c7174c6a2661c581edef98f7d20"

RPROVIDES:${PN} += "libmbus.so.0 \
libmbus0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
