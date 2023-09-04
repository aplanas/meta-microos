SUMMARY = "Kernel driver for the Apple FacetimeHD webcams"
DESCRIPTION = "Reverse engineered Linux driver for the FacetimeHD PCIe webcam"
LICENSE = "GPL-2.0-only"

PV = "0.5.18_k6.4.11_1"

RPM_NAME = "facetimehd-kmp-default-0.5.18_k6.4.11_1-1.62.aarch64.rpm"
RPM_HASH = "8e3ca7553597ca0cf4da6ded1f70014ad304bc8c4e28d3e4964097a4c5c90786a668b4d267bbcb4d6bd8095cdb7caa1b1066b2d40ac29681797151c4518dce88"

RPROVIDES:${PN} += "facetimehd-kmp \
facetimehd-kmp-default \
facetimehd-kmp-default-k6.4.11-1 \
kmod-facetimehd.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
