SUMMARY = "WhatsApp for Linux"
DESCRIPTION = "An unofficial WhatsApp desktop application written in C++."
LICENSE = "GPL-3.0-only"

PV = "1.6.3"

RPM_NAME = "whatsapp-for-linux-1.6.3-1.1.aarch64.rpm"
RPM_HASH = "d4eae8cd943a0378e746d4907cafdf793963bcc78e7d946b4208b34de8de276829ae146734b191849c620576a07b2a84c01ae0ab2e69b2ee279ad3cabce6d45e"

RPROVIDES:${PN} += "whatsapp-for-linux"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libayatana-appindicator3.so.1 \
libc.so.6 \
libcanberra.so.0 \
libgcc-s.so.1 \
libgdkmm-3.0.so.1 \
libgio-2.0.so.0 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
libwebkit2gtk-4.0.so.37"

inherit rpm
