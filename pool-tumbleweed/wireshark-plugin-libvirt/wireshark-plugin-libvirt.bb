SUMMARY = "Wireshark plugin for libvirt RPC protocol"
DESCRIPTION = "Wireshark dissector plugin for better analysis of libvirt RPC traffic."
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.0"

RPM_NAME = "wireshark-plugin-libvirt-9.7.0-1.1.aarch64.rpm"
RPM_HASH = "5e9d9cfbf9354703b822ca9f2b38e986a4d83f5c1e469981b48a7b611e21a9250c7fd5ba0ac1555cf454ed0268ec7e5c97beea0f65c5a3e45c2bfd3010a6ba49"

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
