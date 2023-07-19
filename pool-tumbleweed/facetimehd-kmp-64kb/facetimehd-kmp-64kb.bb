SUMMARY = "Kernel driver for the Apple FacetimeHD webcams"
DESCRIPTION = "Reverse engineered Linux driver for the FacetimeHD PCIe webcam"
LICENSE = "GPL-2.0-only"

PV = "0.5.18_k6.4.3_1"

RPM_NAME = "facetimehd-kmp-64kb-0.5.18_k6.4.3_1-1.57.aarch64.rpm"
RPM_HASH = "ef38514c6041cc56ae89b92a17197b171c46c77e346ea58f61b3d82a30b272778af967217f7e43037719c67df7b0b61eb1c7023f2235e67ab243c38a42d2ec6a"

RPROVIDES:${PN} += "facetimehd-kmp \
facetimehd-kmp-64kb \
facetimehd-kmp-64kb-k6.4.3-1 \
kmod-facetimehd.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
