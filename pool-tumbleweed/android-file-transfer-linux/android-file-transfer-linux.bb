SUMMARY = "Android file fransfer for Linux"
DESCRIPTION = "Android File Transfer for Linux — a MTP client with minimalist UI"
LICENSE = "LGPL-2.1"

PV = "4.3.0~git.20221105T214638.9967dec"

RPM_NAME = "android-file-transfer-linux-4.3.0~git.20221105T214638.9967dec-1.1.aarch64.rpm"
RPM_HASH = "bae45db365cbe3747ec2f61000bc017c06b3fd4ebcc0cbde01483a1786e5be68df1eea328b7038d790eb21753c4701d59a7b85fb099c8288d7743a4f24498870"

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
