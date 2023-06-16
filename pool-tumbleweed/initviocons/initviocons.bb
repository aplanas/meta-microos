SUMMARY = "Terminal Initialization, e.g. for the iSeries Virtual Console"
DESCRIPTION = "Initviocons can be used on the iSeries platform to recognize terminal \
features of a telnet client that is connected to the virtual console \
(similar to a serial console). It probes the terminal via escape \
sequences to find out the screen size and a suitable TERM type. It also \
does special initialization if possible (for example, carriage return \
suppression for Windows telnet clients). On the iSeries platform, it \
additionally checks for the presence of more than one terminal \
connected on the same line. See /etc/profile for a usage example. \
 \
 \
 \
Authors: \
-------- \
    Peter Poeml <poeml@suse.de>"
LICENSE = "GPL-2.0-or-later"

PV = "0.5"

RPM_NAME = "initviocons-0.5-106.2.aarch64.rpm"
RPM_HASH = "9027f92c05fa24bb55a15b792e0f28e4ae75de5857baff8c71de0f0be0a65a256265a719e17e6b1c7a8bc44b791c4707a2e7390bd2101d333068a3d4343200be"

RPROVIDES:${PN} += "initviocons"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
