SUMMARY = "Kernel driver for the Apple FacetimeHD webcams"
DESCRIPTION = "Reverse engineered Linux driver for the FacetimeHD PCIe webcam"
LICENSE = "GPL-2.0-only"

PV = "0.5.18_k6.3.4_1"

RPM_NAME = "facetimehd-kmp-default-0.5.18_k6.3.4_1-1.50.aarch64.rpm"
RPM_HASH = "d4d1e683a2553e7c810044a812290b4562663054dbea1ee0c3d1576e03a9ad21031ace85d00e4952ee573794adb194796842130ecd95b5fd6fddab50f99dabcb"

RPROVIDES:${PN} += "facetimehd-kmp \
facetimehd-kmp-default \
facetimehd-kmp-default-k6.3.4-1 \
kmod-facetimehd.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
