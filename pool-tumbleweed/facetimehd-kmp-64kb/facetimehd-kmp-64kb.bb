SUMMARY = "Kernel driver for the Apple FacetimeHD webcams"
DESCRIPTION = "Reverse engineered Linux driver for the FacetimeHD PCIe webcam"
LICENSE = "GPL-2.0-only"

PV = "0.5.18_k6.4.12_1"

RPM_NAME = "facetimehd-kmp-64kb-0.5.18_k6.4.12_1-1.63.aarch64.rpm"
RPM_HASH = "b4d3fa65d3f6b37928cb52ec15a9cf8ac4190da3f8aa6955a35364f14645d19dc3d024e1ba803258a93dcec80af88dd6d87e81fad72a5178ffe068d48b02607c"

RPROVIDES:${PN} += "facetimehd-kmp \
facetimehd-kmp-64kb \
facetimehd-kmp-64kb-k6.4.12-1 \
kmod-facetimehd.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
