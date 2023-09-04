SUMMARY = "MicroOS KDE Plasma Desktop"
DESCRIPTION = "Packages required for the openSUSE MicroOS with KDE Plasma"
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-desktop-kde-5.0-73.1.aarch64.rpm"
RPM_HASH = "ab549eae796559d788addc23f230ed96cd2abca4124b8dbdba6ceed796404a5862b3b1b70fa170b1edc5e2a8dcce8066a0bc27ea55cfd4ff37e068a60dd698a4"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-desktop-kde"

RDEPENDS:${PN} += "NetworkManager-openvpn \
baloo5-file \
bluedevil5 \
breeze5-wallpapers \
discover-backend-flatpak \
discover-backend-fwupd \
discover-notifier \
dolphin \
ffmpegthumbs \
google-noto-coloremoji-fonts \
google-noto-sans-cjk-fonts \
kate \
kcm-flatpak \
kcm-sddm \
kde-gtk-config5 \
kde-gtk-config5-gtk3 \
kde-print-manager \
kdegraphics-thumbnailers \
kdenetwork-filesharing \
kgamma5 \
kio-extras5 \
kio-fuse \
konsole \
kwalletmanager5 \
kwrited5 \
libqt5-qtimageformats \
noto-sans-math-fonts \
openvpn-auth-pam-plugin \
oxygen5-sounds \
partitionmanager \
pattern- \
phonon4qt5-backend-gstreamer \
pinentry-qt5 \
plasma-branding-MicroOS \
plasma-browser-integration \
plasma-nm5 \
plasma-nm5-openconnect \
plasma-nm5-openvpn \
plasma5-addons \
plasma5-defaults-openSUSE \
plasma5-desktop-emojier \
plasma5-pa \
plasma5-session-wayland \
plasma5-systemmonitor \
purpose \
qqc2-desktop-style \
sddm \
sddm-theme-openSUSE \
spectacle \
xdg-desktop-portal-kde"

inherit rpm
