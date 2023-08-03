SUMMARY = "Empty package to ensure rebuilding kvm_stat in OBS"
DESCRIPTION = "This is empty package that ensures kvm_stat is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "kvm_stat-rebuild-6.4.6-22.28.noarch.rpm"
RPM_HASH = "09264a8496d90a32e7e152bbf68d12cdae89def7fd140711a468b8e9810d7b05b16e11e96f322bb0f3847ebdb7c195313a80c40bf730ba5a144d82d308f314dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kvm-stat-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
