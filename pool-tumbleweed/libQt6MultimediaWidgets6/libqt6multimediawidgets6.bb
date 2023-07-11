SUMMARY = "Qt 6 MultimediaWidgets library"
DESCRIPTION = "The Qt 6 MultimediaWidgets library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6MultimediaWidgets6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "0b68f8aa573dda0fe9caf14c7f86dc4c347dba3c9f1e87c3107ec2576446a8e3ea25ef3a36e03f0def09851dc8e1a30950b9ebb4766a09b72e85254591f28cc6"

RPROVIDES:${PN} += "libQt6MultimediaWidgets.so.6 \
libQt6MultimediaWidgets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
