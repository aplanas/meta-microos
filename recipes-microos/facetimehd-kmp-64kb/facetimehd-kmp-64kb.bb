SUMMARY = "Kernel driver for the Apple FacetimeHD webcams"
DESCRIPTION = "Reverse engineered Linux driver for the FacetimeHD PCIe webcam"
LICENSE = "GPL-2.0-only"

PV = "0.5.18_k6.3.1_1"

RPM_NAME = "facetimehd-kmp-64kb-0.5.18_k6.3.1_1-1.47.aarch64.rpm"
RPM_HASH = "0f3ea25303c1be5c6d2d02f1b2c29e83cccd8b2e9de89e2f1aa3e2314f31894977c91b106351e7c3a9bcac53004211386a0e3d8ba86ac8372058c318b88dd6c1"

RPROVIDES:${PN} += "facetimehd-kmp facetimehd-kmp-64kb facetimehd-kmp-64kb(aarch-64) facetimehd-kmp-64kb-k6.3.1_1 kmod(facetimehd.ko) multiversion(kernel)"
RDEPENDS:${PN} += "/bin/sh coreutils grep kernel-64kb kernel-uname-r suse-kernel-rpm-scriptlets"

inherit rpm
