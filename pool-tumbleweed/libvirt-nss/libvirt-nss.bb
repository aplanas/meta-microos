SUMMARY = "Libvirt plugin for Name Service Switch"
DESCRIPTION = "libvirt plugin for NSS for translating domain names into IP addresses."
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-nss-9.6.0-3.1.aarch64.rpm"
RPM_HASH = "a180b9176e399e00a5a2db41e207ef2fa3afe97d35b00d7844adbd60193e2ceddc2fe78fd7174b3e470a22b42f89beb741f03a759ed69e2884aff73be40511d2"

RPROVIDES:${PN} += "libnss-libvirt-guest.so.2 \
libnss-libvirt.so.2 \
libvirt-nss"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libvirt-daemon-driver-network \
libyajl.so.2"

inherit rpm
