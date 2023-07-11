SUMMARY = "The Point to Point Protocol for Linux"
DESCRIPTION = "The ppp package contains the PPP (Point-to-Point Protocol) daemon, \
pppd, additional PPP utilities, documentation, and sample files. PPP \
provides a method for transmitting IP and IPX datagrams over serial \
point-to-point links, for example over a modem. The PPP daemon handles \
the details of setting up a PPP link including configuring the network \
interface and performing the PPP negotiations."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "2.4.9"

RPM_NAME = "ppp-2.4.9-3.4.aarch64.rpm"
RPM_HASH = "0a24f2c0d2ab072a172d031b1fe2bec3e2ab1a528124c7d76e55776e9595edc9e9bfa22ecbc95ceac81637ad4d54b1441c2c47e1528c5d83461687873fb85a6f"

RPROVIDES:${PN} += "config-ppp \
ppp"

RDEPENDS:${PN} += "/usr/bin/sh \
group-dialout \
libatm.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libpam.so.0 \
libpcap.so.1 \
libssl.so.3"

inherit rpm
