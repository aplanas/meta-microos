SUMMARY = "Firmware for Intel PRO/Wireless WLAN Cards"
DESCRIPTION = "This package contains firmware binaries needed for Intel PRO/Wireless \
2100/2200BG (aka Centrino) WLAN cards. The package is covered by the \
Intel license. See http://ipw2100.sourceforge.net/firmware.php?fid=4."
LICENSE = "SUSE-Firmware"

PV = "9"

RPM_NAME = "ipw-firmware-9-23.7.noarch.rpm"
RPM_HASH = "63e1f5753e7e7396ab0a11e180c691dcc9dc1f15f5f4f98b63d4f11fd34bdb1231925e8ddc959e4383ba13c44ad131bb4b41a38740ac89b7387c498cb8b4b7ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-LICENSE.ipw2200-fw \
firmware-LICENSE.ipw2x00 \
firmware-ipw-2.2-boot.fw \
firmware-ipw-2.2-bss-ucode.fw \
firmware-ipw-2.2-bss.fw \
firmware-ipw-2.2-ibss-ucode.fw \
firmware-ipw-2.2-ibss.fw \
firmware-ipw-2.3-boot.fw \
firmware-ipw-2.3-bss-ucode.fw \
firmware-ipw-2.3-bss.fw \
firmware-ipw-2.3-ibss-ucode.fw \
firmware-ipw-2.3-ibss.fw \
firmware-ipw-2.3-sniffer-ucode.fw \
firmware-ipw-2.3-sniffer.fw \
firmware-ipw-2.4-boot.fw \
firmware-ipw-2.4-bss-ucode.fw \
firmware-ipw-2.4-bss.fw \
firmware-ipw-2.4-ibss-ucode.fw \
firmware-ipw-2.4-ibss.fw \
firmware-ipw-2.4-sniffer-ucode.fw \
firmware-ipw-2.4-sniffer.fw \
firmware-ipw2100-1.3-i.fw \
firmware-ipw2100-1.3-p.fw \
firmware-ipw2100-1.3.fw \
firmware-ipw2200-bss.fw \
firmware-ipw2200-ibss.fw \
firmware-ipw2200-sniffer.fw \
ipw-firmware"

RDEPENDS:${PN} += "/bin/sh \
grep \
modutils"

inherit rpm
