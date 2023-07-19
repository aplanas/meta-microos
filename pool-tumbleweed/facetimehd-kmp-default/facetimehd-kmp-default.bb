SUMMARY = "Kernel driver for the Apple FacetimeHD webcams"
DESCRIPTION = "Reverse engineered Linux driver for the FacetimeHD PCIe webcam"
LICENSE = "GPL-2.0-only"

PV = "0.5.18_k6.4.3_1"

RPM_NAME = "facetimehd-kmp-default-0.5.18_k6.4.3_1-1.57.aarch64.rpm"
RPM_HASH = "7c099db129a842a1c1484588d9767c5224371a4ab9d7d7abd7322c51996d69b9a6662cb3459fcfb0ba9a98a6feb04c65cb80af6975cc6b432b23868c6cd2e4f9"

RPROVIDES:${PN} += "facetimehd-kmp \
facetimehd-kmp-default \
facetimehd-kmp-default-k6.4.3-1 \
kmod-facetimehd.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
