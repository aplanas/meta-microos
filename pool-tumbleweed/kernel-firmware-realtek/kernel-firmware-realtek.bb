SUMMARY = "Kernel firmware files for Realtek wireless drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Realtek wireless drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230724"

RPM_NAME = "kernel-firmware-realtek-20230724-1.1.noarch.rpm"
RPM_HASH = "04f103d3db7855a278655657a3e777fd6b79f21e89495c3283135b794649ce412a80359fed06497bed96e5448e074763644dfc84074cadb9408a2e8985fcdfcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-RTL8192E/boot.img \
firmware-RTL8192E/data.img \
firmware-RTL8192E/main.img \
firmware-rt2860.bin \
firmware-rt2870.bin \
firmware-rt3070.bin \
firmware-rt3071.bin \
firmware-rt3090.bin \
firmware-rt3290.bin \
firmware-rtl-nic/rtl8105e-1.fw \
firmware-rtl-nic/rtl8106e-1.fw \
firmware-rtl-nic/rtl8106e-2.fw \
firmware-rtl-nic/rtl8107e-1.fw \
firmware-rtl-nic/rtl8107e-2.fw \
firmware-rtl-nic/rtl8125a-3.fw \
firmware-rtl-nic/rtl8125b-1.fw \
firmware-rtl-nic/rtl8125b-2.fw \
firmware-rtl-nic/rtl8153a-2.fw \
firmware-rtl-nic/rtl8153a-3.fw \
firmware-rtl-nic/rtl8153a-4.fw \
firmware-rtl-nic/rtl8153b-2.fw \
firmware-rtl-nic/rtl8153c-1.fw \
firmware-rtl-nic/rtl8156a-2.fw \
firmware-rtl-nic/rtl8156b-2.fw \
firmware-rtl-nic/rtl8168d-1.fw \
firmware-rtl-nic/rtl8168d-2.fw \
firmware-rtl-nic/rtl8168e-1.fw \
firmware-rtl-nic/rtl8168e-2.fw \
firmware-rtl-nic/rtl8168e-3.fw \
firmware-rtl-nic/rtl8168f-1.fw \
firmware-rtl-nic/rtl8168f-2.fw \
firmware-rtl-nic/rtl8168fp-3.fw \
firmware-rtl-nic/rtl8168g-1.fw \
firmware-rtl-nic/rtl8168g-2.fw \
firmware-rtl-nic/rtl8168g-3.fw \
firmware-rtl-nic/rtl8168h-1.fw \
firmware-rtl-nic/rtl8168h-2.fw \
firmware-rtl-nic/rtl8402-1.fw \
firmware-rtl-nic/rtl8411-1.fw \
firmware-rtl-nic/rtl8411-2.fw \
firmware-rtlwifi/rtl8188efw.bin \
firmware-rtlwifi/rtl8188eufw.bin \
firmware-rtlwifi/rtl8188fufw.bin \
firmware-rtlwifi/rtl8192cfw.bin \
firmware-rtlwifi/rtl8192cfwU-B.bin \
firmware-rtlwifi/rtl8192cfwU.bin \
firmware-rtlwifi/rtl8192cufw-A.bin \
firmware-rtlwifi/rtl8192cufw-B.bin \
firmware-rtlwifi/rtl8192cufw-TMSC.bin \
firmware-rtlwifi/rtl8192cufw.bin \
firmware-rtlwifi/rtl8192defw.bin \
firmware-rtlwifi/rtl8192eefw.bin \
firmware-rtlwifi/rtl8192eu-ap-wowlan.bin \
firmware-rtlwifi/rtl8192eu-nic.bin \
firmware-rtlwifi/rtl8192eu-wowlan.bin \
firmware-rtlwifi/rtl8192fufw.bin \
firmware-rtlwifi/rtl8192sefw.bin \
firmware-rtlwifi/rtl8710bufw-SMIC.bin \
firmware-rtlwifi/rtl8710bufw-UMC.bin \
firmware-rtlwifi/rtl8712u.bin \
firmware-rtlwifi/rtl8723aufw-A.bin \
firmware-rtlwifi/rtl8723aufw-B-NoBT.bin \
firmware-rtlwifi/rtl8723aufw-B.bin \
firmware-rtlwifi/rtl8723befw-36.bin \
firmware-rtlwifi/rtl8723befw.bin \
firmware-rtlwifi/rtl8723bs-ap-wowlan.bin \
firmware-rtlwifi/rtl8723bs-bt.bin \
firmware-rtlwifi/rtl8723bs-nic.bin \
firmware-rtlwifi/rtl8723bs-wowlan.bin \
firmware-rtlwifi/rtl8723bu-ap-wowlan.bin \
firmware-rtlwifi/rtl8723bu-nic.bin \
firmware-rtlwifi/rtl8723bu-wowlan.bin \
firmware-rtlwifi/rtl8723defw.bin \
firmware-rtlwifi/rtl8723fw-B.bin \
firmware-rtlwifi/rtl8723fw.bin \
firmware-rtlwifi/rtl8812aefw-wowlan.bin \
firmware-rtlwifi/rtl8812aefw.bin \
firmware-rtlwifi/rtl8821aefw-29.bin \
firmware-rtlwifi/rtl8821aefw-wowlan.bin \
firmware-rtlwifi/rtl8821aefw.bin \
firmware-rtlwifi/rtl8822befw.bin \
firmware-rtw88/README \
firmware-rtw88/rtw8723d-fw.bin \
firmware-rtw88/rtw8821c-fw.bin \
firmware-rtw88/rtw8822b-fw.bin \
firmware-rtw88/rtw8822c-fw.bin \
firmware-rtw88/rtw8822c-wow-fw.bin \
firmware-rtw89/rtw8851b-fw.bin \
firmware-rtw89/rtw8852a-fw.bin \
firmware-rtw89/rtw8852b-fw-1.bin \
firmware-rtw89/rtw8852b-fw.bin \
firmware-rtw89/rtw8852c-fw.bin \
kernel-firmware-realtek"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
