SUMMARY = "Kernel firmware files for Texas Instruments wireless drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Texas Instruments wireless drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230707"

RPM_NAME = "kernel-firmware-ti-20230707-1.1.noarch.rpm"
RPM_HASH = "78cb092a222fcadeb2da8d9fe6ac1553db537338f95549d005b0a95c94f5691585a59e5b6b55349c8be9c7b08b078b9bbf81f191c1141f293d28dac5229ad162"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-ti-connectivity/TIInit-6.2.31.bts \
firmware-ti-connectivity/TIInit-6.6.15.bts \
firmware-ti-connectivity/TIInit-7.2.31.bts \
firmware-ti-connectivity/wl1251-fw.bin \
firmware-ti-connectivity/wl1251-nvs.bin \
firmware-ti-connectivity/wl1271-fw-2.bin \
firmware-ti-connectivity/wl1271-fw-ap.bin \
firmware-ti-connectivity/wl1271-fw.bin \
firmware-ti-connectivity/wl1271-nvs.bin \
firmware-ti-connectivity/wl127x-fw-3.bin \
firmware-ti-connectivity/wl127x-fw-4-mr.bin \
firmware-ti-connectivity/wl127x-fw-4-plt.bin \
firmware-ti-connectivity/wl127x-fw-4-sr.bin \
firmware-ti-connectivity/wl127x-fw-5-mr.bin \
firmware-ti-connectivity/wl127x-fw-5-plt.bin \
firmware-ti-connectivity/wl127x-fw-5-sr.bin \
firmware-ti-connectivity/wl127x-fw-plt-3.bin \
firmware-ti-connectivity/wl127x-nvs.bin \
firmware-ti-connectivity/wl128x-fw-3.bin \
firmware-ti-connectivity/wl128x-fw-4-mr.bin \
firmware-ti-connectivity/wl128x-fw-4-plt.bin \
firmware-ti-connectivity/wl128x-fw-4-sr.bin \
firmware-ti-connectivity/wl128x-fw-5-mr.bin \
firmware-ti-connectivity/wl128x-fw-5-plt.bin \
firmware-ti-connectivity/wl128x-fw-5-sr.bin \
firmware-ti-connectivity/wl128x-fw-ap.bin \
firmware-ti-connectivity/wl128x-fw-plt-3.bin \
firmware-ti-connectivity/wl128x-fw.bin \
firmware-ti-connectivity/wl128x-nvs.bin \
firmware-ti-connectivity/wl12xx-nvs.bin \
firmware-ti-connectivity/wl18xx-fw-2.bin \
firmware-ti-connectivity/wl18xx-fw-3.bin \
firmware-ti-connectivity/wl18xx-fw-4.bin \
firmware-ti-connectivity/wl18xx-fw.bin \
firmware-ti-keystone/ks2-qmss-pdsp-acc48-k2-le-1-0-0-9.bin \
kernel-firmware-ti"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
