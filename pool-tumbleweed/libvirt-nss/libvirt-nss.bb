SUMMARY = "Libvirt plugin for Name Service Switch"
DESCRIPTION = "libvirt plugin for NSS for translating domain names into IP addresses."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-nss-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "82530bfdb1485eada1bf456c74496b021d73ab1d6e8d6216f763644b925d593921909809c1d6aae9b87c47478a6b6c449b13b2d48e004e0aa3095fcae7bd03a9"

RPROVIDES:${PN} += "libnss-libvirt-guest.so.2 \
libnss-libvirt.so.2 \
libvirt-nss"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libvirt-daemon-driver-network \
libyajl.so.2"

inherit rpm
