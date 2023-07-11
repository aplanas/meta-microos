SUMMARY = "Kernel driver for the Apple FacetimeHD webcams"
DESCRIPTION = "Reverse engineered Linux driver for the FacetimeHD PCIe webcam"
LICENSE = "GPL-2.0-only"

PV = "0.5.18_k6.3.9_1"

RPM_NAME = "facetimehd-kmp-64kb-0.5.18_k6.3.9_1-1.55.aarch64.rpm"
RPM_HASH = "5c4e16bbe0274d6d6a049258b7507d24289b7f7e3578a7fad77de3f677bc9d391d4533db3c5bd4c3fa78bba325d49f7ca30a16f069a014038d4d71262333a825"

RPROVIDES:${PN} += "facetimehd-kmp \
facetimehd-kmp-64kb \
facetimehd-kmp-64kb-k6.3.9-1 \
kmod-facetimehd.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
