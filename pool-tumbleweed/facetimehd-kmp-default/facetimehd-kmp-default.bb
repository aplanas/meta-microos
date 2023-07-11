SUMMARY = "Kernel driver for the Apple FacetimeHD webcams"
DESCRIPTION = "Reverse engineered Linux driver for the FacetimeHD PCIe webcam"
LICENSE = "GPL-2.0-only"

PV = "0.5.18_k6.3.9_1"

RPM_NAME = "facetimehd-kmp-default-0.5.18_k6.3.9_1-1.55.aarch64.rpm"
RPM_HASH = "54d781fcb53231458e566be4de04bde16f98deeadc44eaffa763f8a6aa9e8643546949df2aec9f512d46608919cdc0fb10b30dd8ddea7feac2eeada501373c70"

RPROVIDES:${PN} += "facetimehd-kmp \
facetimehd-kmp-default \
facetimehd-kmp-default-k6.3.9-1 \
kmod-facetimehd.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
