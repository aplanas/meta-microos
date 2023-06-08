SUMMARY = "Provide SSH access to initramfs early user space"
DESCRIPTION = "This Dracut module integrates the OpenSSH sshd into your \
initramfs. It allows for remote unlocking of a fully encrypted \
root filesystem and remote access to the Dracut emergency shell \
(i.e. early userspace)."
LICENSE = "GPL-3.0-or-later"

PV = "0.6.1"

RPM_NAME = "dracut-sshd-0.6.1-2.8.noarch.rpm"
RPM_HASH = "feac0ab039921d9e99a36168c4f7603322bd4e8a5586294e52a29dd6dc21ad3889fa78e428fd56b2c0e443ba5c686f240989c20179b3e3d76706b15e6d468d6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dracut-sshd"
RDEPENDS:${PN} += "/bin/bash dracut"

inherit rpm
