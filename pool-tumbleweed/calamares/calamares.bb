SUMMARY = "Installer from a live CD/DVD/USB to disk"
DESCRIPTION = "Calamares is a distribution-independent installer framework, designed to install \
from a live CD/DVD/USB environment to a hard disk. It includes a graphical \
installation program based on Qt 5. Calamares can replace YaST2 Live Installer."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.62"

RPM_NAME = "calamares-3.2.62-1.2.aarch64.rpm"
RPM_HASH = "86ccd88e9e059518359144da27dbe90c7847b0bbcae58ca0fc30e7ae2ad648c9a8cbdf487b6ca969230013046e6f30ef9b7cf7da6e774e39d52cb2bd125517fb"

RPROVIDES:${PN} += "calamares \
calamares-libs3 \
libcalamares-job-contextualprocess.so \
libcalamares-job-dracutlukscfg.so \
libcalamares-job-dummycpp.so \
libcalamares-job-fsresizer.so \
libcalamares-job-hostinfo.so \
libcalamares-job-initcpio.so \
libcalamares-job-initramfs.so \
libcalamares-job-luksbootkeyfile.so \
libcalamares-job-luksopenswaphookcfg.so \
libcalamares-job-machineid.so \
libcalamares-job-preservefiles.so \
libcalamares-job-removeuser.so \
libcalamares-job-shellprocess.so \
libcalamares-job-umount.so \
libcalamares-job-zfs.so \
libcalamares-viewmodule-finished.so \
libcalamares-viewmodule-finishedq.so \
libcalamares-viewmodule-interactiveterminal.so \
libcalamares-viewmodule-keyboard.so \
libcalamares-viewmodule-keyboardq.so \
libcalamares-viewmodule-license.so \
libcalamares-viewmodule-locale.so \
libcalamares-viewmodule-localeq.so \
libcalamares-viewmodule-netinstall.so \
libcalamares-viewmodule-notesqml.so \
libcalamares-viewmodule-oemid.so \
libcalamares-viewmodule-packagechooser.so \
libcalamares-viewmodule-packagechooserq.so \
libcalamares-viewmodule-partition.so \
libcalamares-viewmodule-summary.so \
libcalamares-viewmodule-summaryq.so \
libcalamares-viewmodule-tracking.so \
libcalamares-viewmodule-users.so \
libcalamares-viewmodule-usersq.so \
libcalamares-viewmodule-welcome.so \
libcalamares-viewmodule-welcomeq.so \
libcalamares.so.3.2.62 \
libcalamaresui.so.3.2.62"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
NetworkManager \
calamares-branding \
console-setup \
coreutils \
dmidecode \
dosfstools \
dracut \
e2fsprogs \
gawk \
gptfdisk \
grub2 \
kde-cli-tools5 \
kpmcore \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5Parts.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libboost-python-py3.so.1.82.0 \
libc.so.6 \
libcrypt.so.1 \
libgcc-s.so.1 \
libkpmcore.so.12 \
libm.so.6 \
libparted.so.2 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
libyaml-cpp.so.0.8 \
ntfsprogs \
os-prober \
parted \
polkit \
python3 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Window.2 \
rsync \
shadow \
squashfs \
systemd \
upower \
util-linux \
xdg-utils \
xkbutils \
zypper"

inherit rpm
