SUMMARY = "Kernel driver for the Apple FacetimeHD webcams"
DESCRIPTION = "Reverse engineered Linux driver for the FacetimeHD PCIe webcam"
LICENSE = "GPL-2.0-only"

PV = "0.5.18_k6.4.6_1"

RPM_NAME = "facetimehd-kmp-64kb-0.5.18_k6.4.6_1-1.59.aarch64.rpm"
RPM_HASH = "ea1e13cb8d5025eba914a19c8a7b991d4cd5d79f390db0aa0486a68a613f253c0d25a43559101f1b0458e060aafb26ad87129edd107d91f65fa806ef28643713"

RPROVIDES:${PN} += "facetimehd-kmp \
facetimehd-kmp-64kb \
facetimehd-kmp-64kb-k6.4.6-1 \
kmod-facetimehd.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
