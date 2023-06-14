SUMMARY = "Utility for the Generic HDLC layer"
DESCRIPTION = "The sethdlc utility is used to set physical interface, clock rate, \
used HDLC mode, and can add any required PVCs if using Frame Relay. \
 \
https://www.kernel.org/doc/Documentation/networking/generic-hdlc.txt"
LICENSE = "GPL-2.0-only"

PV = "1.18"

RPM_NAME = "sethdlc-1.18-1.9.aarch64.rpm"
RPM_HASH = "cf4f946e0604f3ef201243ac3eaf337d9f70427a6be82e7a95751b3a5df300e697693426b4afeaa3195a2254d6be51cc792cf3ad04a970ad1f7f607d7600a872"

RPROVIDES:${PN} += "sethdlc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
