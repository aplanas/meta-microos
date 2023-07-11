SUMMARY = "System Upgrade Plugin for DNF"
DESCRIPTION = "System Upgrade Plugin for DNF, Python 3 version. Enables offline system upgrades \
using the 'dnf system-upgrade' command."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.17"

RPM_NAME = "python3-dnf-plugin-system-upgrade-4.0.17-2.2.noarch.rpm"
RPM_HASH = "8a03c3c070edb111616dfbe13b357c67991a4d36c9f848a2a36bd1ead5b6e0232efbbe85946fc927022f96de364f93a0b92da74cfa03f5fa5e32a985fdba920a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnf-command-offline-distrosync \
dnf-command-offline-upgrade \
dnf-command-system-upgrade \
dnf-plugin-system-upgrade \
dnf-plugins-extras-system-upgrade \
python3-dnf-plugin-system-upgrade \
python3-dnf-plugins-extras-system-upgrade \
system-upgrade"

RDEPENDS:${PN} += "python-abi \
python3-dnf-plugins-extras-common \
python3-systemd \
systemd"

inherit rpm
