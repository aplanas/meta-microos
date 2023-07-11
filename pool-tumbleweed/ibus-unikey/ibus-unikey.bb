SUMMARY = "Vietnamese engine for IBus input platform"
DESCRIPTION = "A Vietnamese engine for IBus input platform that uses Unikey."
LICENSE = "GPL-3.0"

PV = "0.6.1"

RPM_NAME = "ibus-unikey-0.6.1-11.16.aarch64.rpm"
RPM_HASH = "8f9440ffe43f8c66ed03ea021dbb197085a234745150dff5a85db7225c40380ffe77952db940223fbf638ad044ed8f28de94c80b81931089a11eb93e43c07f34"

RPROVIDES:${PN} += "ibus-unikey \
locale-ibus-vi"

RDEPENDS:${PN} += "ibus \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libibus-1.0.so.5 \
libstdc++.so.6"

inherit rpm
