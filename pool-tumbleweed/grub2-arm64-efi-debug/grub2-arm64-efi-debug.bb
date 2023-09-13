SUMMARY = "Debug symbols for arm64-efi"
DESCRIPTION = "Debug symbols for grub2-arm64-efi \
 \
Information on how to debug grub can be found online: \
https://www.cnblogs.com/coryxie/archive/2013/03/12/2956807.html"
LICENSE = "GPL-3.0-or-later"

PV = "2.12~rc1"

RPM_NAME = "grub2-arm64-efi-debug-2.12~rc1-2.1.noarch.rpm"
RPM_HASH = "efca76b01bf10c8340d833601ee791b4e0d2eae15c032858ad2a9963927e75233d58e0335a824d683cf3ead6804ecc1c3173ee29d74141127c8931c80e1e6699"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-arm64-efi-debug"

RDEPENDS:${PN} += "grub2-arm64-efi"

inherit rpm
