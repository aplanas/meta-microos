SUMMARY = "Qt Development Kit"
DESCRIPTION = "Tools for working with the Qt Quick 3D module."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.10+kde1"

RPM_NAME = "libqt5-qtquick3d-tools-5.15.10+kde1-1.1.aarch64.rpm"
RPM_HASH = "f7adc3a82c2c067632e7c326fb72d7fc4dc3b102fadecfc68b45a493e480832826eb23a68db16fc02d0ec09423ab70e6a7564f4af3a17d38f540f5164c241022"

RPROVIDES:${PN} += "libqt5-qtquick3d-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Quick3DAssetImport.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
