SUMMARY = "Empty package to ensure rebuilding kvm_stat in OBS"
DESCRIPTION = "This is empty package that ensures kvm_stat is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "kvm_stat-rebuild-6.3.4-22.21.noarch.rpm"
RPM_HASH = "adfcc5f03e25dd5092af07a71c7da61a62eaae68d412b18fc91683f0944eaf00a3988b4debd09dc0dcd01cfa2ef0d719cabce2f8c7ac831c1cc4ed7b71bc3033"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kvm_stat-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
