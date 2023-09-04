SUMMARY = "Wireshark plugin for libvirt RPC protocol"
DESCRIPTION = "Wireshark dissector plugin for better analysis of libvirt RPC traffic."
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "wireshark-plugin-libvirt-9.6.0-2.1.aarch64.rpm"
RPM_HASH = "a17364f5d4d26338c1642422728f1ce18a554a02f299462b89dd47bed03153a18b9f0bffd7b57a28eb63ccfac904f587eef0e14a8e4f8601f575241b6a4f7ee6"

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
