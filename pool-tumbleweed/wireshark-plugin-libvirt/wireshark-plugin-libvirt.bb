SUMMARY = "Wireshark plugin for libvirt RPC protocol"
DESCRIPTION = "Wireshark dissector plugin for better analysis of libvirt RPC traffic."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "wireshark-plugin-libvirt-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "d41697c7ce22e6ee124f6eccc145ea0d1648d7b0d4015e0a4edcb5cc659eee74b309f0875e4d23fed21c10171d93342fb1a8c52d75e283432787f6ddcb6cd6eb"

RPROVIDES:${PN} += "libvirt.so \
wireshark-plugin-libvirt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libtirpc.so.3 \
libvirt-libs \
libwireshark.so.16 \
wireshark"

inherit rpm
