SUMMARY = "Deepin desktop-environment - Session UI Shell"
DESCRIPTION = "This project include those sub-project: \
 \
- deepin-shutdown: User interface of shutdown. \
- deepin-lock: User interface of lock screen. \
- deepin-lockservice: The back-end service of locking screen. \
- lightdm-deepin-greeter: The user interface when you login in. \
- deepin-switchtogreeter: The tools to switch the user to login in. \
- deepin-lowpower: The user interface of reminding low power. \
- deepin-osd: User interface of on-screen display. \
- deepin-hotzone: User interface of setting hot zone."
LICENSE = "GPL-3.0+"

PV = "5.5.48"

RPM_NAME = "deepin-session-shell-5.5.48-1.5.aarch64.rpm"
RPM_HASH = "a1a768783cb875a3fd47a73b9b4a3be4b56fcfac6545db4a17dff31d5f7f4cb3c2957528ffe5a07c203084590ddeee65aa8a0ac66269a165bf4cd2ba5711b40f"

RPROVIDES:${PN} += "deepin-session-shell"

RDEPENDS:${PN} += "/usr/bin/bash \
deepin-wallpapers \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xml.so.5 \
libX11.so.6 \
libXi.so.6 \
libXtst.so.6 \
libc.so.6 \
libdframeworkdbus.so.2 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libdtkwidget.so.5 \
libgcc-s.so.1 \
libgsettings-qt.so.1 \
libpam.so.0 \
libstdc++.so.6 \
libxcb.so.1"

inherit rpm
