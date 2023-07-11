SUMMARY = "Snapper Plugin for DNF"
DESCRIPTION = "Snapper Plugin for DNF, Python 3 version. Creates snapshot every transaction."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.17"

RPM_NAME = "python3-dnf-plugin-snapper-4.0.17-2.2.noarch.rpm"
RPM_HASH = "3c715ed05b8c23f17806ffc22a91e6d8e5937f04c479e48293e665353c18242b7b7da5dd48c274d3ccd1e49959977bff877094276048a97b3463da46d1bf4497"
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
