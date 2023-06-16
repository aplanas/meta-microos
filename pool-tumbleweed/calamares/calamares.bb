SUMMARY = "Installer from a live CD/DVD/USB to disk"
DESCRIPTION = "Calamares is a distribution-independent installer framework, designed to install \
from a live CD/DVD/USB environment to a hard disk. It includes a graphical \
installation program based on Qt 5. Calamares can replace YaST2 Live Installer."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.36"

RPM_NAME = "calamares-3.2.36-1.20.aarch64.rpm"
RPM_HASH = "7c3e3cdc7e26c3c4aae5f87f72ef2213b405b9cfe09a93b60bd660857c629f1abf0880aa77ab98f1e06f0a895dc55cc34a8be089eee6d5ce2f00f1ce0ef63997"

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
libcalamares-job-machineid.so \
libcalamares-job-preservefiles.so \
libcalamares-job-removeuser.so \
libcalamares-job-shellprocess.so \
libcalamares-viewmodule-finished.so \
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
libcalamares-viewmodule-partition.so \
libcalamares-viewmodule-summary.so \
libcalamares-viewmodule-tracking.so \
libcalamares-viewmodule-users.so \
libcalamares-viewmodule-usersq.so \
libcalamares-viewmodule-welcome.so \
libcalamares-viewmodule-welcomeq.so \
libcalamares.so.3.2.36 \
libcalamaresui.so.3.2.36"

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
libKF5Service.so.5 \
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
libpython3.10.so.1.0 \
libstdc++.so.6 \
libyaml-cpp.so.0.7 \
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
