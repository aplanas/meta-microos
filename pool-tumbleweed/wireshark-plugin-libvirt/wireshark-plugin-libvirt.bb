SUMMARY = "Wireshark plugin for libvirt RPC protocol"
DESCRIPTION = "Wireshark dissector plugin for better analysis of libvirt RPC traffic."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "wireshark-plugin-libvirt-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "b68c7574427568bb64b169f603306d2115bbdb03bed4cb3a05659badfcd50d957b29401b2a7eff4691a09d29cfc91ec4479ea083f05f98fe44c1cfc3016e0f04"

RPROVIDES:${PN} += "libvirt.so()(64bit) \
wireshark-plugin-libvirt \
wireshark-plugin-libvirt(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libtirpc.so.3()(64bit) \
libvirt-libs \
libwireshark.so.16()(64bit) \
wireshark"

inherit rpm
