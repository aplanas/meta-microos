SUMMARY = "Kernel firmware files for Mediatek network drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Mediatek network drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230620"

RPM_NAME = "kernel-firmware-mediatek-20230620-1.1.noarch.rpm"
RPM_HASH = "1c2bbcdb5b0048103b2dee47ae4008661e3fa3cd1f323a982db1438643f5af5fd12d4fc78bb296d41c5b7f6ebbee16c9e4985d45431d7fbda999486a5114c61d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-mediatek/BT-RAM-CODE-MT7922-1-1-hdr.bin \
firmware-mediatek/BT-RAM-CODE-MT7961-1-2-hdr.bin \
firmware-mediatek/WIFI-MT7922-patch-mcu-1-1-hdr.bin \
firmware-mediatek/WIFI-MT7961-patch-mcu-1-2-hdr.bin \
firmware-mediatek/WIFI-RAM-CODE-MT7922-1.bin \
firmware-mediatek/WIFI-RAM-CODE-MT7961-1.bin \
firmware-mediatek/mt7601u.bin \
firmware-mediatek/mt7610e.bin \
firmware-mediatek/mt7610u.bin \
firmware-mediatek/mt7615-cr4.bin \
firmware-mediatek/mt7615-n9.bin \
firmware-mediatek/mt7615-rom-patch.bin \
firmware-mediatek/mt7622-n9.bin \
firmware-mediatek/mt7622-rom-patch.bin \
firmware-mediatek/mt7622pr2h.bin \
firmware-mediatek/mt7650.bin \
firmware-mediatek/mt7650e.bin \
firmware-mediatek/mt7662-rom-patch.bin \
firmware-mediatek/mt7662.bin \
firmware-mediatek/mt7662u-rom-patch.bin \
firmware-mediatek/mt7662u.bin \
firmware-mediatek/mt7663-n9-rebb.bin \
firmware-mediatek/mt7663-n9-v3.bin \
firmware-mediatek/mt7663pr2h-rebb.bin \
firmware-mediatek/mt7663pr2h.bin \
firmware-mediatek/mt7668pr2h.bin \
firmware-mediatek/mt7915-eeprom-dbdc.bin \
firmware-mediatek/mt7915-eeprom.bin \
firmware-mediatek/mt7915-rom-patch.bin \
firmware-mediatek/mt7915-wa.bin \
firmware-mediatek/mt7915-wm.bin \
firmware-mediatek/mt7916-eeprom.bin \
firmware-mediatek/mt7916-rom-patch.bin \
firmware-mediatek/mt7916-wa.bin \
firmware-mediatek/mt7916-wm.bin \
firmware-mediatek/mt7981-rom-patch.bin \
firmware-mediatek/mt7981-wa.bin \
firmware-mediatek/mt7981-wm.bin \
firmware-mediatek/mt7981-wo.bin \
firmware-mediatek/mt7986-eeprom-mt7975-dual.bin \
firmware-mediatek/mt7986-eeprom-mt7976-dbdc.bin \
firmware-mediatek/mt7986-eeprom-mt7976-dual.bin \
firmware-mediatek/mt7986-eeprom-mt7976.bin \
firmware-mediatek/mt7986-rom-patch-mt7975.bin \
firmware-mediatek/mt7986-rom-patch.bin \
firmware-mediatek/mt7986-wa.bin \
firmware-mediatek/mt7986-wm-mt7975.bin \
firmware-mediatek/mt7986-wm.bin \
firmware-mediatek/mt7986-wo-0.bin \
firmware-mediatek/mt7986-wo-1.bin \
firmware-mediatek/mt8183/scp.img \
firmware-mediatek/mt8186/scp.img \
firmware-mediatek/mt8192/scp.img \
firmware-mediatek/mt8195/scp.img \
firmware-mt7601u.bin \
firmware-mt7650.bin \
firmware-mt7662-rom-patch.bin \
firmware-mt7662.bin \
kernel-firmware-mediatek \
ralink-firmware"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
