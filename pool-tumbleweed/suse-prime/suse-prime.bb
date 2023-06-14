SUMMARY = "GPU (nvidia/intel) selection for NVIDIA optimus laptops with bbswitch support"
DESCRIPTION = "A collection of shell scripts that makes it possible to use the \
NVIDIA GPU on a Optimus Laptop. The switching is similar to \
the feature provided by the nvidia-prime package in Ubuntu. \
Uses bbswitch to switch on/of power of NVIDIA GPU."
LICENSE = "SUSE-Public-Domain"

PV = "0.8.14"

RPM_NAME = "suse-prime-0.8.14-2.1.noarch.rpm"
RPM_HASH = "220022886c715f1b49e189aa8b27f051e0f7da9516cc0068c24da6a1a2e7b33cba73d3eec6e510d04d637d6892cc80a0c279fac65424d4b9b17e5d6092912bd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-suse-prime \
suse-prime \
suse-prime-bbswitch"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
coreutils \
pciutils \
sudo"

inherit rpm
