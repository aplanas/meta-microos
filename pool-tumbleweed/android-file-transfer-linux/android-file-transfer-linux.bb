SUMMARY = "Android file fransfer for Linux"
DESCRIPTION = "Android File Transfer for Linux — a MTP client with minimalist UI"
LICENSE = "LGPL-2.1"

PV = "4.3.0~git.20221105T214638.9967dec"

RPM_NAME = "android-file-transfer-linux-4.3.0~git.20221105T214638.9967dec-1.2.aarch64.rpm"
RPM_HASH = "5cfb0ef60a93aa7c14e13234ed82489c0f46238dd5566e5c2165fcb9295a7073908582823818e2ad8e54dd86adcd83c7373fd525baa1be4f00ba5b9a55e04eab"

RPROVIDES:${PN} += "android-file-transfer-linux"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libcrypto.so.3 \
libfuse.so.2 \
libgcc-s.so.1 \
libreadline.so.8 \
libstdc++.so.6"

inherit rpm
