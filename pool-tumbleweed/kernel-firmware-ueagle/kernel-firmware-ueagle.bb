SUMMARY = "Kernel firmware files for Eagle IV USB ADSL modem driver"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Eagle IV USB ADSL modem driver."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230724"

RPM_NAME = "kernel-firmware-ueagle-20230724-1.1.noarch.rpm"
RPM_HASH = "02d2715a1f4d87eda4cb73f8aa731b496197bf1bceee968bd2719bdfac5c287d46553488ec96051ad44416b00c8539159875d2a1b0c55d3cb9931c0d7e440264"
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
