SUMMARY = "Diagnostic Log and Trace viewing program"
DESCRIPTION = "The Diagnostic Log and Trace Viewer is an application that can send and receive control messages to the DLT daemon."
LICENSE = "MPL-2.0"

PV = "2.23.0"

RPM_NAME = "dlt-viewer-2.23.0-1.3.aarch64.rpm"
RPM_HASH = "e1ec4a21f69038a7ed86b0e32e7fc1b0f4f9c7dbc2702ac8bd92b494f963cce9a17fca6669ae8c1213549972bf83a59682a8d99ffee49f1a650e5768c6ee2828"

RPROVIDES:${PN} += "application() application(org.genivi.DLTViewer.desktop) dlt-viewer dlt-viewer(aarch-64) libdltdbusplugin.so()(64bit) libdltlogstorageplugin.so()(64bit) libdltsystemviewerplugin.so()(64bit) libdlttestrobotplugin.so()(64bit) libdltviewerplugin.so()(64bit) libfiletransferplugin.so()(64bit) libnonverboseplugin.so()(64bit) libqdlt.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5SerialPort.so.5()(64bit) libQt5SerialPort.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
