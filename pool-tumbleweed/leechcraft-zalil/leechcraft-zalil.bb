SUMMARY = "LeechCraft File Uploader Module"
DESCRIPTION = "This package provides a file uploader plugin for LeechCraft \
with which files can be uploaded to accountless filebin services."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-zalil-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "8769aa6399f31961250bc074c4aaa03e07248cd59db4da68ce906cfd8bdaf876ae8d03f0f7d78d182b06f6876da0b5b7c0b09fcfcd152d98a7fe572ad9ef1071"

RPROVIDES:${PN} += "leechcraft-zalil \
libleechcraft-zalil.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
