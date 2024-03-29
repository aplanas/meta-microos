SUMMARY = "Alarm Clock Plugin for the Xfce Panel"
DESCRIPTION = "The Timer plugin provides the functionality of an alarm clock and will run an \
alarm at a specified time or at the end of a specified countdown period."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.2"

RPM_NAME = "xfce4-timer-plugin-1.7.2-1.1.aarch64.rpm"
RPM_HASH = "81024eb6fa2824594a953eb898be728266157b2aadc651f27042fb09ffc62e38968a7676098794747486d60ca7bc13d7791ba7fdc06fb64ff8690bcea69cb5f0"

RPROVIDES:${PN} += "libxfcetimer.so \
xfce4-panel-plugin-timer \
xfce4-timer-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
xfce4-panel"

inherit rpm
