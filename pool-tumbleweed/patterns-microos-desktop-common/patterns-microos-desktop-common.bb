SUMMARY = "Common packages for Desktops on MicroOS"
DESCRIPTION = "Packages required for openSUSE MicroOS Desktops."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-desktop-common-5.0-72.1.aarch64.rpm"
RPM_HASH = "d6b1c2ebe1543a55aa6b1204321b85fc2ed8e749d0a1fab761a63910babf5b97cb54c3034ed4590d283675224278b57432f529c35816fed084b061ee7889397f"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-microos-desktop-common"

RDEPENDS:${PN} += "OpenPrintingPPDs \
avahi \
bash-completion \
bluez-cups \
bluez-firmware \
bolt \
cups \
cups-filters \
cups-pk-helper \
ghostscript \
glibc-locale \
gstreamer-plugin-pipewire \
gzip \
hicolor-icon-theme-branding-openSUSE \
hostname \
hplip-hpijs \
kernel-firmware-all \
ntfs-3g \
ntfsprogs \
pattern- \
pipewire-alsa \
pipewire-pulseaudio \
policycoreutils-python-utils \
polkit-default-privs \
sof-firmware \
system-config-printer-common \
system-config-printer-dbus-service \
systemd-icon-branding-openSUSE \
transactional-update-notifier \
udev-configure-printer \
udisks2 \
unzip \
upower \
wget \
xdg-desktop-portal-gtk \
xdg-utils"

inherit rpm
