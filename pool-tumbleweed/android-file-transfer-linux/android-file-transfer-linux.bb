SUMMARY = "Android file fransfer for Linux"
DESCRIPTION = "Android File Transfer for Linux — a MTP client with minimalist UI"
LICENSE = "LGPL-2.1"

PV = "4.3.0~git.20221105T214638.9967dec"

RPM_NAME = "android-file-transfer-linux-4.3.0~git.20221105T214638.9967dec-1.1.aarch64.rpm"
RPM_HASH = "bae45db365cbe3747ec2f61000bc017c06b3fd4ebcc0cbde01483a1786e5be68df1eea328b7038d790eb21753c4701d59a7b85fb099c8288d7743a4f24498870"

RPROVIDES:${PN} += "android-file-transfer-linux \
android-file-transfer-linux(aarch-64) \
application() \
application(android-file-transfer.desktop) \
metainfo() \
metainfo(android-file-transfer.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libfuse.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libreadline.so.8()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
