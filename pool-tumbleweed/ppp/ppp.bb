SUMMARY = "The Point to Point Protocol for Linux"
DESCRIPTION = "The ppp package contains the PPP (Point-to-Point Protocol) daemon, \
pppd, additional PPP utilities, documentation, and sample files. PPP \
provides a method for transmitting IP and IPX datagrams over serial \
point-to-point links, for example over a modem. The PPP daemon handles \
the details of setting up a PPP link including configuring the network \
interface and performing the PPP negotiations."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "2.4.9"

RPM_NAME = "ppp-2.4.9-3.3.aarch64.rpm"
RPM_HASH = "f42f9e73846043447b45d9d432d2a70cc5164a464d7af24a44e59bc9928dfc6544c9cd8c3c2de372de9a425cbf458cf0b6dbe7664be01202235e2c65a33aebe7"

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
