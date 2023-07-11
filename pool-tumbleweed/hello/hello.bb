SUMMARY = "A Friendly Greeting Program"
DESCRIPTION = "The GNU hello program produces a familiar, friendly greeting.  It \
allows nonprogrammers to use a classic computer science tool that would \
otherwise be unavailable to them.  Because it is protected by the GNU \
General Public License, users are free to share and change it. \
 \
GNU hello supports many native languages."
LICENSE = "GPL-3.0-or-later"

PV = "2.12.1"

RPM_NAME = "hello-2.12.1-1.4.aarch64.rpm"
RPM_HASH = "ed9fd14e1794c98401bcfdda3820c519f74ec864a213c24a706111fcf35789f9b4096579a3c4578e09de512b426ce101c99e4a0215ea1b6b1c4aef3f9b54110c"

RPROVIDES:${PN} += "hello \
mailreader"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
