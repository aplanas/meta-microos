SUMMARY = "RpmConf Plugin for DNF"
DESCRIPTION = "RpmConf Plugin for DNF, Python 3 version. Handles .rpmnew, .rpmsave every \
transaction."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.17"

RPM_NAME = "python3-dnf-plugin-rpmconf-4.0.17-2.2.noarch.rpm"
RPM_HASH = "8d4f5b65ef60f2f8099fcabadd87983240ac0ab56ab4c710a67878e9203b35f3fbf257f3a6d3536869114818821905cac3eeb6facfb0799834d6a0f36631cbe5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-python3-dnf-plugin-rpmconf \
dnf-plugin-rpmconf \
dnf-plugins-extras-rpmconf \
python3-dnf-plugin-rpmconf \
python3-dnf-plugins-extras-rpmconf \
yum-merge-conf"

RDEPENDS:${PN} += "python-abi \
python3-dnf-plugins-extras-common \
python3-rpmconf"

inherit rpm
