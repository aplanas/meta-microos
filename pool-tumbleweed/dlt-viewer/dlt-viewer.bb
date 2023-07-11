SUMMARY = "Diagnostic Log and Trace viewing program"
DESCRIPTION = "The Diagnostic Log and Trace Viewer is an application that can send and receive control messages to the DLT daemon."
LICENSE = "MPL-2.0"

PV = "2.23.0"

RPM_NAME = "dlt-viewer-2.23.0-1.4.aarch64.rpm"
RPM_HASH = "10d59376d0f6943ad60c927121bd82aaa6d39643b146134f1a874911148645895df18b7281beceb475452b8caf358110f7223ca8bcccf8f5e0461da289c4be27"

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
