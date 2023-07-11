SUMMARY = "Kernel firmware files for Marvell network drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Marvell network drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230620"

RPM_NAME = "kernel-firmware-marvell-20230620-1.1.noarch.rpm"
RPM_HASH = "a70b049e893053efd9cf822c9fbf57a1b41f332f1b62497f5291c8e892902ec7fd9ce366eb381d7355d9e053f16ebe181c808ddea8477d7135c29837d31d92ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-lbtf-usb.bin \
firmware-libertas/cf8381-helper.bin \
firmware-libertas/cf8381.bin \
firmware-libertas/cf8385-helper.bin \
firmware-libertas/cf8385.bin \
firmware-libertas/gspi8682-helper.bin \
firmware-libertas/gspi8682.bin \
firmware-libertas/gspi8686-v9-helper.bin \
firmware-libertas/gspi8686-v9.bin \
firmware-libertas/gspi8688-helper.bin \
firmware-libertas/gspi8688.bin \
firmware-libertas/lbtf-sdio.bin \
firmware-libertas/sd8385-helper.bin \
firmware-libertas/sd8385.bin \
firmware-libertas/sd8682-helper.bin \
firmware-libertas/sd8682.bin \
firmware-libertas/sd8686-v8-helper.bin \
firmware-libertas/sd8686-v8.bin \
firmware-libertas/sd8686-v9-helper.bin \
firmware-libertas/sd8686-v9.bin \
firmware-libertas/sd8688-helper.bin \
firmware-libertas/sd8688.bin \
firmware-libertas/usb8388-olpc.bin \
firmware-libertas/usb8388-v5.bin \
firmware-libertas/usb8388-v9.bin \
firmware-libertas/usb8682.bin \
firmware-mrvl/sd8688-helper.bin \
firmware-mrvl/sd8688.bin \
firmware-mwl8k/fmimage-8366-ap-1.fw \
firmware-mwl8k/fmimage-8366-ap-2.fw \
firmware-mwl8k/fmimage-8366-ap-3.fw \
firmware-mwl8k/fmimage-8366.fw \
firmware-mwl8k/fmimage-8687.fw \
firmware-mwl8k/fmimage-8764-ap-1.fw \
firmware-mwl8k/helper-8366.fw \
firmware-mwl8k/helper-8687.fw \
firmware-mwlwifi/88W8864.bin \
firmware-mwlwifi/88W8897.bin \
kernel-firmware-marvell"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
