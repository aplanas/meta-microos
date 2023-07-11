SUMMARY = "Libvirt plugin for Name Service Switch"
DESCRIPTION = "libvirt plugin for NSS for translating domain names into IP addresses."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-nss-9.4.0-3.1.aarch64.rpm"
RPM_HASH = "f678ae0ce91ba2deecb36b3898699cd48c8185e1e3cdff992226d4fb30ff7d3f69976927d84d4a21d60f0feb4ecd749808a095f9aab85cdbee54666af0fe792b"

RPROVIDES:${PN} += "libnss-libvirt-guest.so.2 \
libnss-libvirt.so.2 \
libvirt-nss"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libvirt-daemon-driver-network \
libyajl.so.2"

inherit rpm
