SUMMARY = "Kernel driver for the Apple FacetimeHD webcams"
DESCRIPTION = "Reverse engineered Linux driver for the FacetimeHD PCIe webcam"
LICENSE = "GPL-2.0-only"

PV = "0.5.18_k6.3.4_1"

RPM_NAME = "facetimehd-kmp-64kb-0.5.18_k6.3.4_1-1.50.aarch64.rpm"
RPM_HASH = "060b4c2f2d5e1028b4aafa03b2c07db767c4538b8ad9c9007fafb5f32a6aa4f5e4bad7f4cc7040d2d715ebaca4469e0c531cee6e38e6ed789a0743dddd9c4d82"

RPROVIDES:${PN} += "facetimehd-kmp \
facetimehd-kmp-64kb \
facetimehd-kmp-64kb(aarch-64) \
facetimehd-kmp-64kb-k6.3.4_1 \
kmod(facetimehd.ko) \
multiversion(kernel)"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
