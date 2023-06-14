SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_baseu_xml-suse3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "d5d739ea637e5ec4c0bbe18dac483636b4724695f1c86df7e6dc0dbe4cf7a334aa7429e0989caa67305a04ac7ec16becb5892faee42262e880fb7b6d340fd162"

RPROVIDES:${PN} += "libwx-baseu-xml-suse.so.3.0.5 \
libwx-baseu-xml-suse3-0-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse.so.3.0.5"

inherit rpm
