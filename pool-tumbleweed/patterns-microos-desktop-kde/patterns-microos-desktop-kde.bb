SUMMARY = "MicroOS KDE Plasma Desktop"
DESCRIPTION = "Packages required for the openSUSE MicroOS with KDE Plasma"
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-desktop-kde-5.0-72.1.aarch64.rpm"
RPM_HASH = "3280b6a98e4d15269510a1713103c281f935850d749cbbe2d7432c3783f543be2dff10e9a594dcb4098ede60bf1df3c0da63e2c34541acfa4e70cc93e94285c1"

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
