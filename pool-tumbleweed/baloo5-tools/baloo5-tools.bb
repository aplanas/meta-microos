SUMMARY = "Aditional components for Baloo Framework"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains aditional command line utilities."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.106.0"

RPM_NAME = "baloo5-tools-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "f3da45028f2e80dd6883f0eb8fba1339b00d70d262ea11016353798a8f41688d2a942c70fed4fb8be793c06a9cb3828236cd30816825fdf451bf4320d1d1fd95"

RPROVIDES:${PN} += "baloo-tools \
baloo5-tools \
baloo5-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5Baloo.so.5()(64bit) \
libKF5BalooEngine.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5FileMetaData.so.3()(64bit) \
libKF5I18n.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
