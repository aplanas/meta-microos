SUMMARY = "Libvirt plugin for Name Service Switch"
DESCRIPTION = "libvirt plugin for NSS for translating domain names into IP addresses."
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.0"

RPM_NAME = "libvirt-nss-9.7.0-1.1.aarch64.rpm"
RPM_HASH = "5a9904895c2529ef886731ff4e3590b13b0accaa29087393744edd9741d979eb5b2d0fe68c5706e09a01075fed4b2f417b0d8aa3a0ce99f262a8dc97f8056bf0"

RPROVIDES:${PN} += "libnss-libvirt-guest.so.2 \
libnss-libvirt.so.2 \
libvirt-nss"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libvirt-daemon-driver-network \
libyajl.so.2"

inherit rpm
