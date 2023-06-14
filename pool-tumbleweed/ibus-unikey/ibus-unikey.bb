SUMMARY = "Vietnamese engine for IBus input platform"
DESCRIPTION = "A Vietnamese engine for IBus input platform that uses Unikey."
LICENSE = "GPL-3.0"

PV = "0.6.1"

RPM_NAME = "ibus-unikey-0.6.1-11.15.aarch64.rpm"
RPM_HASH = "3ea020d80d03528dc85bff46cde3993d16739cc2ca1babce8aa3d8f8f0f3d446312b6428b1787386062f0a00ceeb1358f369c29e70ea49e67bf1ee1ff2f72d52"

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
