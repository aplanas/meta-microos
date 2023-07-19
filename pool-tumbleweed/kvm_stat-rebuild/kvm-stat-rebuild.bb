SUMMARY = "Empty package to ensure rebuilding kvm_stat in OBS"
DESCRIPTION = "This is empty package that ensures kvm_stat is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "kvm_stat-rebuild-6.4.3-22.26.noarch.rpm"
RPM_HASH = "4eb07be806ca539d3b969bd08ce23a5f78a3bbcbb68313844b0140d56e4b8d696d2d62cae72254774e51b8aa41324cfe431c148aef8c1385c22de36983582f9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kvm-stat-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
