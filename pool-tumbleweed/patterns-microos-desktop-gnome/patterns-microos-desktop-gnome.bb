SUMMARY = "MicroOS GNOME Desktop"
DESCRIPTION = "Packages required for the openSUSE MicroOS Desktop with GNOME."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-desktop-gnome-5.0-72.1.aarch64.rpm"
RPM_HASH = "1c9e142e7b4fc70d8ed526efc3c229750235a2a992f7d89a344a1fefd1d5b93d4de6f1d5ea3afeb09dd6fc795e624276499bbb98ee2e16cffc51a897907fed73"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-desktop-gnome"

RDEPENDS:${PN} += "NetworkManager-openconnect-gnome \
NetworkManager-openvpn-gnome \
adobe-sourcecodepro-fonts \
adobe-sourcesanspro-fonts \
adobe-sourceserifpro-fonts \
adwaita-icon-theme \
at-spi2-core \
bluez-auto-enable-devices \
canberra-gtk-play \
chrome-gnome-shell \
dejavu-fonts \
desktop-data \
desktop-file-utils \
flatpak \
gcr-ssh-askpass \
gcr3-ssh-askpass \
gdk-pixbuf-thumbnailer \
gdm-branding-MicroOS \
ghostscript-fonts-other \
ghostscript-fonts-std \
gjs \
gnome-bluetooth \
gnome-branding-MicroOS \
gnome-color-manager \
gnome-control-center-goa \
gnome-disk-utility \
gnome-initial-setup \
gnome-keyring-pam \
gnome-menus-branding-openSUSE \
gnome-online-accounts \
gnome-session-default-session \
gnome-session-wayland \
gnome-shell-calendar \
gnome-shell-classic \
gnome-shell-search-provider-nautilus \
gnome-software \
gnome-system-monitor \
gnome-terminal \
gnome-tweak-tool \
gnome-user-docs \
google-carlito-fonts \
google-droid-fonts \
google-opensans-fonts \
google-roboto-fonts \
gpgme \
gsf-office-thumbnailer \
gstreamer-plugins-bad \
gstreamer-plugins-good \
gtk2-branding-openSUSE \
gtk3-branding-openSUSE \
gtk4-branding-openSUSE \
gvfs-backend-afc \
gvfs-backend-goa \
gvfs-backend-samba \
gvfs-backends \
gvfs-fuse \
libgnomesu \
nautilus \
nautilus-extension-seahorse \
nautilus-extension-terminal \
nautilus-share \
noto-coloremoji-fonts \
noto-emoji-fonts \
noto-sans-fonts \
openssh-askpass-gnome \
pattern- \
pinentry-gnome3 \
polkit-gnome \
rsvg-thumbnailer \
samba \
seahorse-daemon \
system-group-wheel \
xdg-desktop-portal-gnome \
xdg-user-dirs-gtk \
yelp"

inherit rpm
