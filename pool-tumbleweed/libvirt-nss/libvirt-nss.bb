SUMMARY = "Libvirt plugin for Name Service Switch"
DESCRIPTION = "libvirt plugin for NSS for translating domain names into IP addresses."
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-nss-9.6.0-2.1.aarch64.rpm"
RPM_HASH = "4d726ebe45d958bdb7bf70702f5e210331d05f281f777af2256228962279a6bd31cf5d94ea44928d982021928846e5752b47bf990f59048bbeea4fcebb6143a7"

RPROVIDES:${PN} += "libnss-libvirt-guest.so.2 \
libnss-libvirt.so.2 \
libvirt-nss"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libvirt-daemon-driver-network \
libyajl.so.2"

inherit rpm
