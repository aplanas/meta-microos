SUMMARY = "Development files for the USB CEC adapter communication library"
DESCRIPTION = "libCEC is an enabling platform for the CEC bus in HDMI, it allows \
developers to interact with other HDMI devices without having to \
worry about the communication overhead, handshaking, and the various \
ways of sending a message for each vendor. \
 \
This subpackage contains the headers for libcec."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.2"

RPM_NAME = "libcec-devel-6.0.2-3.1.aarch64.rpm"
RPM_HASH = "88e654453c73b14074ad3afdd152e1c55fe759b27edfde38d1758e7093a0f2e0cbee9ef485eaf5e1e63d23b7c388d8bffebfc35f4b2a7edec28baac2efcb0d59"

RPROVIDES:${PN} += "libcec-devel \
pkgconfig-libcec"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcec6 \
pkgconfig-p8-platform"

inherit rpm
