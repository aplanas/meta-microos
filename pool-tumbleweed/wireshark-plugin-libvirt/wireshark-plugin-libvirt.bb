SUMMARY = "Wireshark plugin for libvirt RPC protocol"
DESCRIPTION = "Wireshark dissector plugin for better analysis of libvirt RPC traffic."
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "wireshark-plugin-libvirt-9.6.0-3.1.aarch64.rpm"
RPM_HASH = "7a8596671e6671ddbe5a986ba264d8b545990e497c74fe0299db86315cf89fa1838733b9fe4b58168fca05937be576311beae0fa834c1a99c753400b3397c2b9"

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
