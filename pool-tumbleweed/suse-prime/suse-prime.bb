SUMMARY = "GPU (nvidia/intel) selection for NVIDIA optimus laptops with bbswitch support"
DESCRIPTION = "A collection of shell scripts that makes it possible to use the \
NVIDIA GPU on a Optimus Laptop. The switching is similar to \
the feature provided by the nvidia-prime package in Ubuntu. \
Uses bbswitch to switch on/of power of NVIDIA GPU."
LICENSE = "SUSE-Public-Domain"

PV = "0.8.14"

RPM_NAME = "suse-prime-0.8.14-2.2.noarch.rpm"
RPM_HASH = "97e669abbe4fec206d71129b03a3df2e9ef5ebac14a645d1a82761e599386f20a2bdb0197841fd08836ed1e5c3a5c516bef7bd5a4a65729fe496e1977c9ab60c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-suse-prime \
suse-prime \
suse-prime-bbswitch"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
pciutils \
sudo"

inherit rpm
