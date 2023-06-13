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

RPROVIDES:${PN} += "application() \
application(veyon-configurator.desktop) \
application(veyon-master.desktop) \
libkldap-light.so()(64bit) \
libldap-common.so()(64bit) \
libveyon-core.so()(64bit) \
veyon \
veyon(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkexec \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6DBus.so.6()(64bit) \
libQt6DBus.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libX11.so.6()(64bit) \
libXcomposite.so.1()(64bit) \
libXdamage.so.1()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXi.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libXrandr.so.2()(64bit) \
libXtst.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libfakekey.so.0()(64bit) \
liblber.so.2()(64bit) \
liblber.so.2(OPENLDAP_2.200)(64bit) \
libldap.so.2()(64bit) \
libldap.so.2(OPENLDAP_2.200)(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libprocps.so.8()(64bit) \
libprocps.so.8(LIBPROCPS_0)(64bit) \
libqca-qt6.so.2()(64bit) \
libsasl2.so.3()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libvncclient.so.1()(64bit) \
libvncserver.so.1()(64bit) \
permissions \
systemd"

inherit rpm
