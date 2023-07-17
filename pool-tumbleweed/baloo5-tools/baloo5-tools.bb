SUMMARY = "Aditional components for Baloo Framework"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains aditional command line utilities."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.108.0"

RPM_NAME = "baloo5-tools-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "c4ace37f3b89c031b084d4961015a04bfac0e8300fc39243edf5bf52ec451b3a47e2f94de4e580250efc8964cecebe334c0132ecd40dca4c5aa933c352817a6f"

RPROVIDES:${PN} += "baloo-tools \
baloo5-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Baloo.so.5 \
libKF5BalooEngine.so.5 \
libKF5CoreAddons.so.5 \
libKF5FileMetaData.so.3 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
