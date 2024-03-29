SUMMARY = "LeechCraft File Uploader Module"
DESCRIPTION = "This package provides a file uploader plugin for LeechCraft \
with which files can be uploaded to accountless filebin services."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-zalil-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "ef42c909ffad9f3d08ea152192f7663cfb093d3c6f27bdda1ce61b4d1ae856c50d1a219f0f552e0fe60d4b762cabd3f9b8a83853c70157da7e27c5799a628675"

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
