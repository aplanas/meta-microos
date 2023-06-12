SUMMARY = "Diverse plugins for Dolphin"
DESCRIPTION = "Plugin for the Dolphin file properties dialog, displaying the \
metadata of files in the ODF formats and a plugin adding a 'Print' \
action for several formats to the filemanager context menu and \
calling the related Calligra programs."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-extras-dolphin-3.2.1-7.17.aarch64.rpm"
RPM_HASH = "39fd76617a707ad5db42ddb93b990acc684dbc0243587efdc5d46bdb64f2fbfd1b28190635b80fa681cf2cf4d6de274b38cfa8d238b8a6d8e9dc4ee877dce240"

RPROVIDES:${PN} += "calligra-extras-dolphin calligra-extras-dolphin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libkowidgets.so.17()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
