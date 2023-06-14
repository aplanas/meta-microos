SUMMARY = "X11 Inter-Client Exchange Library"
DESCRIPTION = "The Inter-Client Exchange (ICE) protocol is intended to provide a \
framework for building such protocols, allowing them to make use of \
common negotiation mechanisms and to be multiplexed over a single \
transport connection."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "libICE6-1.1.1-1.3.aarch64.rpm"
RPM_HASH = "771b17f4941ad58279f264e0b6621f3c5850e078d9c3b4b6df17fe464d94fecfbf0d078c267ea8e562b2348ad91ece60ed6240091cf3f2818ce970e682869b18"

RPROVIDES:${PN} += "libICE.so.6 \
libICE6 \
xorg-x11-libICE"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
