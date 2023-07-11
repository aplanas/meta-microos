SUMMARY = "Wireshark plugin for libvirt RPC protocol"
DESCRIPTION = "Wireshark dissector plugin for better analysis of libvirt RPC traffic."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "wireshark-plugin-libvirt-9.4.0-3.1.aarch64.rpm"
RPM_HASH = "d78bed791b806bdfc08bc4334b00815f716a91331f01907ececbfdbd1a500e2b2af0d807cd56f2f227a01f8ae0e93537ce8d3d16559e8b719895bd8cbf7dc656"

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
