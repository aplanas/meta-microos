SUMMARY = "Bandwidth usage bar"
DESCRIPTION = "bwbar is a small program that generates a text and a graphical readout \
of the current bandwidth use to be displayed on a web page. \
 \
It is used, among others, at http://www.kernel.org/. \
 \
Authors: \
-------- \
    H. Peter Anvin <hpa@zytor.com>"
LICENSE = "GPL-2.0-or-later"

PV = "1.2.3"

RPM_NAME = "bwbar-1.2.3-8.8.aarch64.rpm"
RPM_HASH = "f430499066edc74f2dae1f15cc30d6081b425a89dda46a765462bafabfb29146b9f5d895bc07fe029db4ed10fcd5dce489272bb39dffd8c1a6c61a9c1f0553e8"

RPROVIDES:${PN} += "bwbar"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpng16.so.16 \
systemd"

inherit rpm
