SUMMARY = "Osmocom SIGTRAN STP (Signaling Transfer Point)"
DESCRIPTION = "This is the Osmocom (Open Source Mobile Communications) \
implementation of a Signaling Transfer Point (STP) for SS7/SIGTRAN \
telecommunication networks. At this point, it is a minimal \
implementation, missing lots of the functionality usually present in \
a STP, such as Global Title Routing, Global Title Translation."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "osmo-stp-1.7.0-1.2.aarch64.rpm"
RPM_HASH = "f7ff234990b86173d0fa3e17e1d1d86391df51efad1d47eab9448b4b0864006a6d29973f4bc068797cd6e17e979851f2ccc9316417a7208e382c2c432692b972"

RPROVIDES:${PN} += "config-osmo-stp \
osmo-stp"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmo-sigtran.so.7 \
libosmocore.so.20 \
libosmovty.so.9 \
libtalloc.so.2"

inherit rpm
