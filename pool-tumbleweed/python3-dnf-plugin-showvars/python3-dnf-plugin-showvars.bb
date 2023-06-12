SUMMARY = "showvars Plugin for DNF"
DESCRIPTION = "This plugin dumps the current value of any defined DNF variables. For example \
$releasever and $basearch."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.17"

RPM_NAME = "python3-dnf-plugin-showvars-4.0.17-2.1.noarch.rpm"
RPM_HASH = "0c7509a0081f043ed1e31b003256f77bf5021217010034fe9ed5de87cb15b27e74b61542ff34114b9dce081b2b87888ed524c4ae1b001db693719ceaaa618b6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnf-plugin-showvars \
python3-dnf-plugin-showvars \
python3-dnf-plugins-extras-showvars"
RDEPENDS:${PN} += "python(abi) \
python3-dnf-plugins-extras-common"

inherit rpm
