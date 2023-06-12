SUMMARY = "Libvirt plugin for Name Service Switch"
DESCRIPTION = "libvirt plugin for NSS for translating domain names into IP addresses."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-nss-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "cb9aebda0bdfcf618887145fc944542f1f7eb12c98d2735cd93c04cb3446a100d616a1c7b1fe9c90a15714816e8a050185edf8106e2c6052491675bf8b3c203d"

RPROVIDES:${PN} += "libnss_libvirt.so.2()(64bit) \
libnss_libvirt_guest.so.2()(64bit) \
libvirt-nss \
libvirt-nss(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libvirt-daemon-driver-network \
libyajl.so.2()(64bit)"

inherit rpm
