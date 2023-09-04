SUMMARY = "Packages only for the DVD of openSUSE MicroOS"
DESCRIPTION = "Additional packages on a openSUSE MicroOS DVD."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-onlyDVD-5.0-73.1.aarch64.rpm"
RPM_HASH = "d2f50f9a894a5ed1bfb83a1a2e021285fbb5ba96aa2864c97dda7589f10249fe483b8d5c1c0a650f0b3f19b9a42adaa7a7a7aec56d68b25d5d7368e0c510d62a"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-microos-onlyDVD"

RDEPENDS:${PN} += "ModemManager \
NetworkManager-wwan \
apparmor-utils \
bcache-tools \
crda \
cryptsetup \
firewalld \
hyper-v \
iscsiuio \
lvm2 \
multipath-tools \
nvme-cli \
open-iscsi \
open-vm-tools \
pam-pwquality \
pattern- \
policycoreutils-python-utils \
qemu-guest-agent \
spice-vdagent \
tftpboot-installation-openSUSE-MicroOS-aarch64 \
wpa-supplicant \
xfsprogs"

inherit rpm
