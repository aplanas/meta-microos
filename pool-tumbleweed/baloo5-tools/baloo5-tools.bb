SUMMARY = "Aditional components for Baloo Framework"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains aditional command line utilities."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.109.0"

RPM_NAME = "baloo5-tools-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "ba8d73141dac6c5dcdb7e2f2aef1c613aab8ec2f3340bab08101214517fb81fc7706bc1635f44a91439f10db8a7670c28b4dd2878c6e44018a36b6be891831ba"

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
