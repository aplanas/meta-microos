SUMMARY = "5250 Emulator"
DESCRIPTION = "The 5250 is most commonly used for connecting to IBM's AS/400.	While \
one can connect to an AS/400 with a VT100 emulator, it is not ideal. \
The problem is that the 5250 is a screen at a time terminal, whereas \
the VT100 is a character at a time device.  The emulator uses telnet's \
binary mode to transfer the 5250 data stream."
LICENSE = "LGPL-2.1-or-later"

PV = "0.16.5"

RPM_NAME = "tn5250-0.16.5-469.7.aarch64.rpm"
RPM_HASH = "4cedfea744a801434a0922918e486f8b9622268c90dc19fa297536876970303b5b9b441d6fdccaf3783be9c41e8d3b969a5be591c4d808b7d0acebe5a12176ed"

RPROVIDES:${PN} += "tn5250"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
lib5250.so.0 \
libc.so.6"

inherit rpm
