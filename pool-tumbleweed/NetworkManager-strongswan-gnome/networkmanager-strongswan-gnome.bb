SUMMARY = "NetworkManager VPN support for strongSwan"
DESCRIPTION = "NetworkManager-strongswan provides VPN support to NetworkManager for \
strongSwan."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.2"

RPM_NAME = "NetworkManager-strongswan-gnome-1.5.2-1.9.aarch64.rpm"
RPM_HASH = "144006802348c105c650048fd18993cfd9d937a01de2e244c2bdb0d61f7adb99e35c330748000f72743c71d4024c41ec0f4872520cbc142d9ab3b439efe8b8db"

RPROVIDES:${PN} += "NetworkManager-strongswan-frontend \
NetworkManager-strongswan-gnome"

RDEPENDS:${PN} += "NetworkManager-strongswan \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnm.so.0 \
libnma.so.0 \
libsecret-1.so.0"

inherit rpm
