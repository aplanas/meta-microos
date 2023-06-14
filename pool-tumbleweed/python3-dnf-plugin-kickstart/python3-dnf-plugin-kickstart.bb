SUMMARY = "Kickstart Plugin for DNF"
DESCRIPTION = "Kickstart Plugin for DNF, Python 3 version. Install packages listed in a \
Kickstart file."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.17"

RPM_NAME = "python3-dnf-plugin-kickstart-4.0.17-2.1.noarch.rpm"
RPM_HASH = "cd21a6742096ff6489729c7ae321b224fdb868759000e4ca54c1391889ee87a5adb2d21354ff1ff664cf12a6497279c97e468ce113b798e0bf4cb39642cc5b40"
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
