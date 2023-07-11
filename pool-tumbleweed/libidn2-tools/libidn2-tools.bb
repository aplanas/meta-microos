SUMMARY = "Command line utility to convert Int. Domain Names"
DESCRIPTION = "An implementation of the IDNA2008 specifications (RFCs 5890, 5891, 5892, 5893)"
LICENSE = "GPL-3.0-or-later"

PV = "2.3.4"

RPM_NAME = "libidn2-tools-2.3.4-1.4.aarch64.rpm"
RPM_HASH = "f54ff1194ec76445b6d02d1d111ab3b47de612c7c61ddbb435d1ac5867c73536bc3658bf511ac875a0bc96f9d91889e4206a726e1caacf00e14ffc0f29f58f25"

RPROVIDES:${PN} += "libidn2-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libidn2.so.0 \
libunistring.so.5"

inherit rpm
