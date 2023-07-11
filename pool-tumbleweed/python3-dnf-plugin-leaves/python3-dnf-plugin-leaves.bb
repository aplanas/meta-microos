SUMMARY = "Leaves Plugin for DNF"
DESCRIPTION = "Leaves Plugin for DNF, Python 3 version. List all installed packages \
not required by any other installed package."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.1"

RPM_NAME = "python3-dnf-plugin-leaves-4.3.1-2.2.noarch.rpm"
RPM_HASH = "fbdb54982ea720953c6787f67384b95b8b151e3d12cfd79e968e9f0a5d6608025524974702b15b840be26a0f4ee822f1ce17b5e880ea2e42fac89dcf46e91884"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnf-command-leaves \
dnf-plugin-leaves \
dnf-plugins-extras-leaves \
python3-dnf-plugin-leaves \
python3-dnf-plugins-extras-leaves"

RDEPENDS:${PN} += "python-abi \
python3-dnf-plugins-core"

inherit rpm
