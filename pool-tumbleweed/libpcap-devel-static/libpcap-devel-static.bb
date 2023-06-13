SUMMARY = "A Library for Network Sniffers"
DESCRIPTION = "libpcap static libraries"
LICENSE = "BSD-3-Clause"

PV = "1.10.4"

RPM_NAME = "libpcap-devel-static-1.10.4-1.1.aarch64.rpm"
RPM_HASH = "3f4b5b54ee5ce211c079f742db255248e8f83cb0a39e2c76c068ba841cf13e57dfcb80c91ae102bc37537489cdc046a6a7cce271eba479befbc4100accfbe72b"

RPROVIDES:${PN} += "libpcap-devel-static \
libpcap-devel-static(aarch-64)"

RDEPENDS:${PN} += "bluez-devel \
dbus-1-devel \
libnl3-devel \
libpcap-devel \
pkgconfig(libusb-1.0)"

inherit rpm
