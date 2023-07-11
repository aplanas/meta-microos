SUMMARY = "Kickstart Plugin for DNF"
DESCRIPTION = "Kickstart Plugin for DNF, Python 3 version. Install packages listed in a \
Kickstart file."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.17"

RPM_NAME = "python3-dnf-plugin-kickstart-4.0.17-2.2.noarch.rpm"
RPM_HASH = "9b1672c0defc2a7ef19c187ad9ef06eb9b7049f295650162e6ac5f71a077cc387970e9f826375080e5b84bad8b421713d6894d0b9d4e608007f4225f3a1ea16d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnf-command-kickstart \
dnf-plugin-kickstart \
dnf-plugins-extras-kickstart \
python3-dnf-plugin-kickstart \
python3-dnf-plugins-extras-kickstart"

RDEPENDS:${PN} += "python-abi \
python3-dnf-plugins-extras-common \
python3-pykickstart"

inherit rpm
