SUMMARY = "Leaves Plugin for DNF"
DESCRIPTION = "Leaves Plugin for DNF, Python 3 version. List all installed packages \
not required by any other installed package."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.1"

RPM_NAME = "python3-dnf-plugin-leaves-4.3.1-2.1.noarch.rpm"
RPM_HASH = "b7e5c372c7146efe844d872cab0e2f4370ce4c123906e751c64af9388f3b1a6f3bf01d83479ed71fd004f79b6b1e53e36fbf3d259d08b42b3497c34070389e87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnf-command(leaves) \
dnf-plugin-leaves \
dnf-plugins-extras-leaves \
python3-dnf-plugin-leaves \
python3-dnf-plugins-extras-leaves"
RDEPENDS:${PN} += "python(abi) \
python3-dnf-plugins-core"

inherit rpm
