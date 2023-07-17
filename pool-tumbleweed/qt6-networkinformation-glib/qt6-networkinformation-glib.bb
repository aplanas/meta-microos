SUMMARY = "Network information for QNetworkInformation using GNetworkMonitor"
DESCRIPTION = "Plugin using GNetworkMonitor to get network information such as the \
reachability, media type..."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-networkinformation-glib-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "9b1d483bfa542493f5032dc9cbfa27df99e4038121a2ca04498528a43ad2f981e47ce5fdff58181979f7b216a48aad23dd42eb0c60fb8e6ee8b572dc9c234e79"

RPROVIDES:${PN} += "libqglib.so \
qt6-networkinformation-glib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libgio-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6"

inherit rpm
