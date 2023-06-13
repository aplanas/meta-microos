SUMMARY = "Installer from a live CD/DVD/USB to disk"
DESCRIPTION = "Calamares is a distribution-independent installer framework, designed to install \
from a live CD/DVD/USB environment to a hard disk. It includes a graphical \
installation program based on Qt 5. Calamares can replace YaST2 Live Installer."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.36"

RPM_NAME = "calamares-3.2.36-1.20.aarch64.rpm"
RPM_HASH = "7c3e3cdc7e26c3c4aae5f87f72ef2213b405b9cfe09a93b60bd660857c629f1abf0880aa77ab98f1e06f0a895dc55cc34a8be089eee6d5ce2f00f1ce0ef63997"

RPROVIDES:${PN} += "application() \
application(calamares.desktop) \
calamares \
calamares(aarch-64) \
calamares-libs3 \
libcalamares.so.3.2.36()(64bit) \
libcalamares_job_contextualprocess.so()(64bit) \
libcalamares_job_dracutlukscfg.so()(64bit) \
libcalamares_job_dummycpp.so()(64bit) \
libcalamares_job_fsresizer.so()(64bit) \
libcalamares_job_hostinfo.so()(64bit) \
libcalamares_job_initcpio.so()(64bit) \
libcalamares_job_initramfs.so()(64bit) \
libcalamares_job_luksbootkeyfile.so()(64bit) \
libcalamares_job_machineid.so()(64bit) \
libcalamares_job_preservefiles.so()(64bit) \
libcalamares_job_removeuser.so()(64bit) \
libcalamares_job_shellprocess.so()(64bit) \
libcalamares_viewmodule_finished.so()(64bit) \
libcalamares_viewmodule_interactiveterminal.so()(64bit) \
libcalamares_viewmodule_keyboard.so()(64bit) \
libcalamares_viewmodule_keyboardq.so()(64bit) \
libcalamares_viewmodule_license.so()(64bit) \
libcalamares_viewmodule_locale.so()(64bit) \
libcalamares_viewmodule_localeq.so()(64bit) \
libcalamares_viewmodule_netinstall.so()(64bit) \
libcalamares_viewmodule_notesqml.so()(64bit) \
libcalamares_viewmodule_oemid.so()(64bit) \
libcalamares_viewmodule_packagechooser.so()(64bit) \
libcalamares_viewmodule_partition.so()(64bit) \
libcalamares_viewmodule_summary.so()(64bit) \
libcalamares_viewmodule_tracking.so()(64bit) \
libcalamares_viewmodule_users.so()(64bit) \
libcalamares_viewmodule_usersq.so()(64bit) \
libcalamares_viewmodule_welcome.so()(64bit) \
libcalamares_viewmodule_welcomeq.so()(64bit) \
libcalamaresui.so.3.2.36()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
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
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Parts.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5QuickWidgets.so.5()(64bit) \
libQt5QuickWidgets.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libboost_python-py3.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libkpmcore.so.12()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libparted.so.2()(64bit) \
libpython3.10.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libyaml-cpp.so.0.7()(64bit) \
ntfsprogs \
os-prober \
parted \
polkit \
python3 \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Window.2) \
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
