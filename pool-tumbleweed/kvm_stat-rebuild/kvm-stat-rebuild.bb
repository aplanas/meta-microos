SUMMARY = "Empty package to ensure rebuilding kvm_stat in OBS"
DESCRIPTION = "This is empty package that ensures kvm_stat is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "kvm_stat-rebuild-6.4.11-22.31.noarch.rpm"
RPM_HASH = "235d69c31caa2373b89363d54e002fc67df1bd3536813bc9f7ea9a06f1239e239a1ef862285ee5dfaa23bac98f85a7a2b888862e5fda2094354e50654e88183e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kvm-stat-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
