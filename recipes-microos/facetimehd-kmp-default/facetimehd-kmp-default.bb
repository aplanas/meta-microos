SUMMARY = "Kernel driver for the Apple FacetimeHD webcams"
DESCRIPTION = "Reverse engineered Linux driver for the FacetimeHD PCIe webcam"
LICENSE = "GPL-2.0-only"

PV = "0.5.18_k6.3.1_1"

RPM_NAME = "facetimehd-kmp-default-0.5.18_k6.3.1_1-1.47.aarch64.rpm"
RPM_HASH = "747a569619c0badcb2ee6fa08a7ac1c139b4660a8d4726e116a8d731606af63031a9e540e66951b22d5a01f71957cfb9fa9d48be47605c12a8f4a57d04ee043b"

RPROVIDES:${PN} += "facetimehd-kmp facetimehd-kmp-default facetimehd-kmp-default(aarch-64) facetimehd-kmp-default-k6.3.1_1 kmod(facetimehd.ko) multiversion(kernel)"
RDEPENDS:${PN} += "/bin/sh coreutils grep kernel-default kernel-uname-r suse-kernel-rpm-scriptlets"

inherit rpm
