SUMMARY = "Computer monitoring and classroom management"
DESCRIPTION = "Veyon is a software for computer monitoring and classroom \
management supporting Windows and Linux. It enables teachers to view and \
control computer labs and interact with students. Veyon is available in \
different languages. The user can: \
 \
* see what's going on in computer labs in overview mode and take screenshots \
* remote control computers to support and help users \
* broadcast the teacher's screen to students in realtime by using demo mode \
  (either in fullscreen or in a window) \
* lock workstations for attracting attention to teacher \
* send text messages to students \
* power on/off and rebooting computers remote \
* remote logoff and remote execute arbitrary commands/scripts \
* do home schooling"
LICENSE = "GPL-2.0-or-later"

PV = "4.7.5"

RPM_NAME = "veyon-4.7.5-2.1.aarch64.rpm"
RPM_HASH = "b7d950c5dba04fbbcabce97f2ed8e81d0522d602a948083f447575e2ef0333debf4b0ca040048799c8ff73cfe0a3f4f2e67ddfc9fc1128e112b81768c8c98d23"

RPROVIDES:${PN} += "libkldap-light.so \
libldap-common.so \
libveyon-core.so \
veyon"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkexec \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libXcomposite.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXtst.so.6 \
libc.so.6 \
libcrypto.so.3 \
libfakekey.so.0 \
liblber.so.2 \
libldap.so.2 \
libpam.so.0 \
libprocps.so.8 \
libqca-qt6.so.2 \
libsasl2.so.3 \
libssl.so.3 \
libstdc++.so.6 \
libvncclient.so.1 \
libvncserver.so.1 \
permissions \
systemd"

inherit rpm
