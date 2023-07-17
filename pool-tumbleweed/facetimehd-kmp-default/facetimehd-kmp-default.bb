SUMMARY = "Kernel driver for the Apple FacetimeHD webcams"
DESCRIPTION = "Reverse engineered Linux driver for the FacetimeHD PCIe webcam"
LICENSE = "GPL-2.0-only"

PV = "0.5.18_k6.4.2_1"

RPM_NAME = "facetimehd-kmp-default-0.5.18_k6.4.2_1-1.56.aarch64.rpm"
RPM_HASH = "8927f1b5acead0144f4a21ae737317d2925d42bbec1b5c907ed81fcc6a8b7f6641e96f0d9362022b579a0a81d811801b51cdf70062125c34b892e904b8665872"

RPROVIDES:${PN} += "facetimehd-kmp \
facetimehd-kmp-default \
facetimehd-kmp-default-k6.4.2-1 \
kmod-facetimehd.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
