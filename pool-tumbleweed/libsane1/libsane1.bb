SUMMARY = "Core SANE library"
DESCRIPTION = "This contains the SANE library. Individual scanner backends are provided \
by sane-backends or third party packages."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & SUSE-Public-Domain"

PV = "1.2.1"

RPM_NAME = "libsane1-1.2.1-1.1.aarch64.rpm"
RPM_HASH = "5ae537c02ed56d3e0bb19863d31b17f5027c7913acda6d2716f8160591c65051452fbda3b76cbb09297f2799553b348a69eb103fe6f2e0d325386ecc58caec2b"

RPROVIDES:${PN} += "libsane.so.1()(64bit) \
libsane1 \
libsane1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libusb-1.0.so.0()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
