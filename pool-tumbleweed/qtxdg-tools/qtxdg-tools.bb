SUMMARY = "User tools for libqtxg"
DESCRIPTION = "User tools for libqtxdg. \
qtxdg-tools contains a CLI MIME tool, qtxdg-mat, for handling file associations and opening files with their default applications. \
It is maintained by the LXQt project and needed by LXQt Session, in order to be used by xdg-utils. Yet it can be used independently from LXQt, too."
LICENSE = "LGPL-2.1-or-later"

PV = "3.11.0"

RPM_NAME = "qtxdg-tools-3.11.0-1.2.aarch64.rpm"
RPM_HASH = "5a415e0c17b1677e8c6110c22503051e4c84b6b102711257b76848a5fcc9f6adb60e62ccd503fefd507313e8dae80dfd9831747bfc972bdbe82301aac241b2b1"

RPROVIDES:${PN} += "cmake-qtxdg-tools \
qtxdg-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Xdg.so.3 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
