SUMMARY = "Diagnostic Log and Trace viewing program"
DESCRIPTION = "The Diagnostic Log and Trace Viewer is an application that can send and receive control messages to the DLT daemon."
LICENSE = "MPL-2.0"

PV = "2.23.0"

RPM_NAME = "dlt-viewer-2.23.0-1.3.aarch64.rpm"
RPM_HASH = "e1ec4a21f69038a7ed86b0e32e7fc1b0f4f9c7dbc2702ac8bd92b494f963cce9a17fca6669ae8c1213549972bf83a59682a8d99ffee49f1a650e5768c6ee2828"

RPROVIDES:${PN} += "dlt-viewer \
libdltdbusplugin.so \
libdltlogstorageplugin.so \
libdltsystemviewerplugin.so \
libdlttestrobotplugin.so \
libdltviewerplugin.so \
libfiletransferplugin.so \
libnonverboseplugin.so \
libqdlt.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5SerialPort.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
