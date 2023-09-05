SUMMARY = "Kernel firmware files for Eagle IV USB ADSL modem driver"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Eagle IV USB ADSL modem driver."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230829"

RPM_NAME = "kernel-firmware-ueagle-20230829-1.1.noarch.rpm"
RPM_HASH = "d32db26fd399280696ca7ed6e77cb351c55db2ce571ac52b93356df9adc1e153c9124ea183146ee46487bbfbe37063f9b48c31c89f7bfcbd26601c3c4093df54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-ueagle-atm/930-fpga.bin \
firmware-ueagle-atm/CMV4p.bin.v2 \
firmware-ueagle-atm/CMV9i.bin \
firmware-ueagle-atm/CMV9p.bin \
firmware-ueagle-atm/CMVei.bin \
firmware-ueagle-atm/CMVeiWO.bin \
firmware-ueagle-atm/CMVep.bin \
firmware-ueagle-atm/CMVepES.bin \
firmware-ueagle-atm/CMVepES03.bin \
firmware-ueagle-atm/CMVepFR.bin \
firmware-ueagle-atm/CMVepFR04.bin \
firmware-ueagle-atm/CMVepFR10.bin \
firmware-ueagle-atm/CMVepIT.bin \
firmware-ueagle-atm/CMVepWO.bin \
firmware-ueagle-atm/DSP4p.bin \
firmware-ueagle-atm/DSP9i.bin \
firmware-ueagle-atm/DSP9p.bin \
firmware-ueagle-atm/DSPei.bin \
firmware-ueagle-atm/DSPep.bin \
firmware-ueagle-atm/adi930.fw \
firmware-ueagle-atm/eagleI.fw \
firmware-ueagle-atm/eagleII.fw \
firmware-ueagle-atm/eagleIII.fw \
firmware-ueagle-atm/eagleIV.fw \
kernel-firmware-ueagle"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
