SUMMARY = "Packages only for the DVD of openSUSE MicroOS"
DESCRIPTION = "Additional packages on a openSUSE MicroOS DVD."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-onlyDVD-5.0-72.1.aarch64.rpm"
RPM_HASH = "d4e6a90b620034cfb02576ce8539ac24726f8c851edf40cfae580f09f15e9844efc48608e4b2a09d9b26562f7a99af625ab5b827a43daceec62469d778de39e1"

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
