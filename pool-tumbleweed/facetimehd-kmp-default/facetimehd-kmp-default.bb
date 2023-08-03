SUMMARY = "Kernel driver for the Apple FacetimeHD webcams"
DESCRIPTION = "Reverse engineered Linux driver for the FacetimeHD PCIe webcam"
LICENSE = "GPL-2.0-only"

PV = "0.5.18_k6.4.6_1"

RPM_NAME = "facetimehd-kmp-default-0.5.18_k6.4.6_1-1.59.aarch64.rpm"
RPM_HASH = "167309db62c9087a24ab0071fe5af044e2856b631de168b43c276ad5fc86874243bfed887c277d66fd5b1c437785941894969d23703c749c177c227fc9b0c683"

RPROVIDES:${PN} += "facetimehd-kmp \
facetimehd-kmp-default \
facetimehd-kmp-default-k6.4.6-1 \
kmod-facetimehd.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
