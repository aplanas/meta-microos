SUMMARY = "Empty package to ensure rebuilding kvm_stat in OBS"
DESCRIPTION = "This is empty package that ensures kvm_stat is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "kvm_stat-rebuild-6.3.9-22.24.noarch.rpm"
RPM_HASH = "001514373003062ab7bdc299d5f426303745b635bf745b37ed69ed4466dab7f50fc2b89780d926bb06b86e4623d9944c230d5c341a90c2475fc12ed5b80a1af2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kvm-stat-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
