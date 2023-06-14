SUMMARY = "System Load Monitoring Plugin for the Xfce Panel"
DESCRIPTION = "The Systemload plugin can display the current CPU load, used memory and swap \
space as well as the system uptime in the panel."
LICENSE = "BSD-2-Clause"

PV = "1.3.2"

RPM_NAME = "xfce4-systemload-plugin-1.3.2-1.3.aarch64.rpm"
RPM_HASH = "5f051ff7373de2ec6d772b68aecbe05e05913ae66404922bad9cf3f84fa85fb22b78c79d870dafb05966b59c32d66c4f6a373c0526820ce00da32e295e506a12"

RPROVIDES:${PN} += "libsystemload.so \
xfce4-panel-plugin-systemload \
xfce4-systemload-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libupower-glib.so.3 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
xfce4-panel"

inherit rpm
