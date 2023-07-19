SUMMARY = "Wireshark plugin for libvirt RPC protocol"
DESCRIPTION = "Wireshark dissector plugin for better analysis of libvirt RPC traffic."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "wireshark-plugin-libvirt-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "3c725ef06f1edb77bb9dcabdabd13d8f2bc8768a90714ec5688a5b58b05ec021169fefdc7523cd52413f39cb30255f316e2e77a39e44e6a96c71ebf7f2199160"

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
