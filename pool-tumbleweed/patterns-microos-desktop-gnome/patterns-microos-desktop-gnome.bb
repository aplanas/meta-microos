SUMMARY = "MicroOS GNOME Desktop"
DESCRIPTION = "Packages required for the openSUSE MicroOS Desktop with GNOME."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-desktop-gnome-5.0-73.1.aarch64.rpm"
RPM_HASH = "6463797060dd925cac94a213330259299eb6fdea59aa17b3d1d1434db7d8484d830c5d6c1674cc9bccae776fd0f63dad40ec69667d1af1ad8d87ac275f606533"

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
