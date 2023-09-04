SUMMARY = "Kernel driver for the Apple FacetimeHD webcams"
DESCRIPTION = "Reverse engineered Linux driver for the FacetimeHD PCIe webcam"
LICENSE = "GPL-2.0-only"

PV = "0.5.18_k6.4.11_1"

RPM_NAME = "facetimehd-kmp-64kb-0.5.18_k6.4.11_1-1.62.aarch64.rpm"
RPM_HASH = "a6f547a7f551527b6e1eb56b8d58dd09e1812aca06136fcfa9f4bbcc9d9646d57fc2ac21a52875d0475c9355e7d40221c384d8063e1889dd3109566f44c30925"

RPROVIDES:${PN} += "facetimehd-kmp \
facetimehd-kmp-64kb \
facetimehd-kmp-64kb-k6.4.11-1 \
kmod-facetimehd.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
