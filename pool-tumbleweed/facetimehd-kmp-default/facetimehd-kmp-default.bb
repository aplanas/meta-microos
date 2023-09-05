SUMMARY = "Kernel driver for the Apple FacetimeHD webcams"
DESCRIPTION = "Reverse engineered Linux driver for the FacetimeHD PCIe webcam"
LICENSE = "GPL-2.0-only"

PV = "0.5.18_k6.4.12_1"

RPM_NAME = "facetimehd-kmp-default-0.5.18_k6.4.12_1-1.63.aarch64.rpm"
RPM_HASH = "4e1e5401340a67bd059b8545126a5f8eda4d36f144804827899ce3f087ac59f2899c58a56805d0cc3a433a3961ea785069c530ddc67e6ca1d17fabed648e1f4c"

RPROVIDES:${PN} += "facetimehd-kmp \
facetimehd-kmp-default \
facetimehd-kmp-default-k6.4.12-1 \
kmod-facetimehd.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
