SUMMARY = "Empty package to ensure rebuilding kvm_stat in OBS"
DESCRIPTION = "This is empty package that ensures kvm_stat is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "kvm_stat-rebuild-6.4.12-22.32.noarch.rpm"
RPM_HASH = "5391f2cbc97aaff7ca75731a513518f36144fd3235cc910ff0cede0226e6578105667bf6157560013c1fb4a5e0cf24f7f36c9e19b7916b3182f22e7deef6ebe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kvm-stat-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
