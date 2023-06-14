SUMMARY = "Notifications Library -- Tools"
DESCRIPTION = "D-BUS notifications library. \
 \
This package contains the notify-send tool to create notifications."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "libnotify-tools-0.8.2-1.3.aarch64.rpm"
RPM_HASH = "b7ad1291a1eab4dae9af4c5ea2c6aeb3f847012ac17288e12f84e5b53b26dce3b22b0167a1acc7c79e0c68b5f172dfd4f8a6c1c596dbbc5cb88343431515c484"

RPROVIDES:${PN} += "libnotify \
libnotify-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnotify.so.4"

inherit rpm
