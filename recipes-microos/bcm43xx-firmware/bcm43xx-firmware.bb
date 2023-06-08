SUMMARY = "Firmware for the Broadcom/Cypress BCM43xx chipset family"
DESCRIPTION = "This package provides the firmware files needed for the \
Broadcom (now Cypress) BCM43430 Wifi+Bluetooth chipset \
as well as NVRAM config files for BCM43362, BCM43430 and \
further related chipsets."
LICENSE = "SUSE-Firmware"

PV = "20180314"

RPM_NAME = "bcm43xx-firmware-20180314-15.5.noarch.rpm"
RPM_HASH = "1d7a21328ea57349a46ff8cbf461355e3c25016dfc29a3ea3a4c5e2f1e9a1f320b79e626e3a6d580c92030b508a65b313239b7d154f1477a9d3556d13b8fb0b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "4-compute-module.txt) 400.txt) bcm43xx-firmware bpi-m2.txt) cubox-i-dl.txt) cubox-i-q.txt) firmware(BCM43430A1.hcd) firmware(BCM43430B0.hcd) firmware(BCM4345C0.hcd) firmware(BCM4345C5.hcd) firmware(brcm/BCM43430A1.hcd) firmware(brcm/BCM43430B0.hcd) firmware(brcm/BCM4345C0.hcd) firmware(brcm/BCM4345C5.hcd) firmware(brcm/brcmfmac4329-sdio.solidrun firmware(brcm/brcmfmac4330-sdio.solidrun firmware(brcm/brcmfmac43362-sdio.sinovoip firmware(brcm/brcmfmac4339-sdio.tronsmart firmware(brcm/brcmfmac43430b0-sdio.clm_blob) firmware(brcm/brcmfmac43430b0-sdio.raspberrypi firmware(brcm/brcmfmac43436-sdio.bin) firmware(brcm/brcmfmac43436-sdio.clm_blob) firmware(brcm/brcmfmac43436-sdio.txt) firmware(brcm/brcmfmac43456-sdio.bin) firmware(brcm/brcmfmac43456-sdio.clm_blob) firmware(brcm/brcmfmac43456-sdio.raspberrypi firmware(brcm/brcmfmac43456-sdio.txt) firmware(brcm/brcmfmac4356-pcie.txt) model-zero-2-w.bin) model-zero-2-w.txt) vega-s95-telos.txt)"
RDEPENDS:${PN} += "kernel-firmware-brcm"

inherit rpm
