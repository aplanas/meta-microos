SUMMARY = "A Library for Network Sniffers"
DESCRIPTION = "libpcap static libraries"
LICENSE = "BSD-3-Clause"

PV = "1.10.4"

RPM_NAME = "libpcap-devel-static-1.10.4-1.2.aarch64.rpm"
RPM_HASH = "54d15966375c632cf75eb862e253d97b2266b7497bead795607aaaba87b813e985d823db98756345e47b0a7be2acf488d2b6c0ecd9090cb1fcddf8e12140138f"

RPROVIDES:${PN} += "libpcap-devel-static"

RDEPENDS:${PN} += "bluez-devel \
dbus-1-devel \
libnl3-devel \
libpcap-devel \
pkgconfig-libusb-1.0"

inherit rpm
