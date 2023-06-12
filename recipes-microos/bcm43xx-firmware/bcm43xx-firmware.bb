SUMMARY = "Firmware for the Broadcom/Cypress BCM43xx chipset family"
DESCRIPTION = "This package provides the firmware files needed for the \
Broadcom (now Cypress) BCM43430 Wifi+Bluetooth chipset \
as well as NVRAM config files for BCM43362, BCM43430 and \
further related chipsets."
LICENSE = "SUSE-Firmware"

PV = "20180314"

RPM_NAME = "bcm43xx-firmware-20180314-16.1.noarch.rpm"
RPM_HASH = "859956247c5ab4ee78fd3c090da28d17b84d2bb30e74aa78f06d7e5d410a9ec43c5780814d67735a2f25a177a2b876331958ad9d68d29e39fb7e095483141db1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "4-compute-module.txt) 400.txt) bcm43xx-firmware bpi-m2.txt) cubox-i-dl.txt) cubox-i-q.txt) firmware(BCM43430A1.hcd) firmware(BCM43430B0.hcd) firmware(BCM4345C0.hcd) firmware(BCM4345C5.hcd) firmware(brcm/BCM43430A1.hcd) firmware(brcm/BCM43430B0.hcd) firmware(brcm/BCM4345C0.hcd) firmware(brcm/BCM4345C5.hcd) firmware(brcm/brcmfmac4329-sdio.solidrun firmware(brcm/brcmfmac4330-sdio.solidrun firmware(brcm/brcmfmac43362-sdio.sinovoip firmware(brcm/brcmfmac4339-sdio.tronsmart firmware(brcm/brcmfmac43430b0-sdio.clm_blob) firmware(brcm/brcmfmac43430b0-sdio.raspberrypi firmware(brcm/brcmfmac43436-sdio.bin) firmware(brcm/brcmfmac43436-sdio.clm_blob) firmware(brcm/brcmfmac43436-sdio.txt) firmware(brcm/brcmfmac43456-sdio.bin) firmware(brcm/brcmfmac43456-sdio.clm_blob) firmware(brcm/brcmfmac43456-sdio.raspberrypi firmware(brcm/brcmfmac43456-sdio.txt) firmware(brcm/brcmfmac4356-pcie.txt) model-zero-2-w.bin) model-zero-2-w.txt) vega-s95-telos.txt)"
RDEPENDS:${PN} += "kernel-firmware-brcm"

inherit rpm
