SUMMARY = "Common packages for Desktops on MicroOS"
DESCRIPTION = "Packages required for openSUSE MicroOS Desktops."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-desktop-common-5.0-73.1.aarch64.rpm"
RPM_HASH = "868252353bcb3bf01dbf5d05e35603422f54408a0ce857791f0b33902644d4d06466a66df31f86631a9711b95df60b0ceea7adbc14be8921696b4dcde28cb255"

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
