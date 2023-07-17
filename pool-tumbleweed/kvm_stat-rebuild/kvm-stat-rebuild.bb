SUMMARY = "Empty package to ensure rebuilding kvm_stat in OBS"
DESCRIPTION = "This is empty package that ensures kvm_stat is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "kvm_stat-rebuild-6.4.2-22.25.noarch.rpm"
RPM_HASH = "1e4588043fae6f5bf5888c82d057242ce42d41fe575f1d30d0620b6c8df48fcbb7c708691a75e9480cd59ac4709cc5c2fe30375ec7ad97a55d661953cdd03440"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kvm-stat-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
