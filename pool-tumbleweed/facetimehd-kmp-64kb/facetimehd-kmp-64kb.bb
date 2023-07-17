SUMMARY = "Kernel driver for the Apple FacetimeHD webcams"
DESCRIPTION = "Reverse engineered Linux driver for the FacetimeHD PCIe webcam"
LICENSE = "GPL-2.0-only"

PV = "0.5.18_k6.4.2_1"

RPM_NAME = "facetimehd-kmp-64kb-0.5.18_k6.4.2_1-1.56.aarch64.rpm"
RPM_HASH = "52cdd40ab153a3be82de4666d1ce983e3e9dd927e54e5488b52d708ee52e549a54f81af466454190b0e82a6c713644ccfd9a17a319d1ece47cb881675c45697d"

RPROVIDES:${PN} += "facetimehd-kmp \
facetimehd-kmp-64kb \
facetimehd-kmp-64kb-k6.4.2-1 \
kmod-facetimehd.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
