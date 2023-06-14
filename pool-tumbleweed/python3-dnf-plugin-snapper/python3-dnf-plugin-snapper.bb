SUMMARY = "Snapper Plugin for DNF"
DESCRIPTION = "Snapper Plugin for DNF, Python 3 version. Creates snapshot every transaction."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.17"

RPM_NAME = "python3-dnf-plugin-snapper-4.0.17-2.1.noarch.rpm"
RPM_HASH = "228156179fd8ea2b49d1b630ae96ee778f95e56557669fdd5d34af18a71bee5191db5a162ce914ffc00bd388492c7c61a54a6e0bdcd3562be7c35fc92a974574"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnf-plugin-snapper \
dnf-plugins-extras-snapper \
python3-dnf-plugin-snapper \
python3-dnf-plugins-extras-snapper"

RDEPENDS:${PN} += "python-abi \
python3-dbus-python \
python3-dnf-plugins-extras-common \
snapper"

inherit rpm
