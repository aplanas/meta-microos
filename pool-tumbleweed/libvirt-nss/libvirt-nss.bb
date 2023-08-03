SUMMARY = "Libvirt plugin for Name Service Switch"
DESCRIPTION = "libvirt plugin for NSS for translating domain names into IP addresses."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-nss-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "28173ee38fa9a12528355164e0aa3c4bb095dc9abe30a90764981932520e66dce7561082e1cc199418970e70f5074616cdf2a97e844e7b7686b5fbf835693ce9"

RPROVIDES:${PN} += "libnss-libvirt-guest.so.2 \
libnss-libvirt.so.2 \
libvirt-nss"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libvirt-daemon-driver-network \
libyajl.so.2"

inherit rpm
