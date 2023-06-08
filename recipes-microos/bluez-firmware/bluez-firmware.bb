SUMMARY = "Bluetooth(TM) Firmware"
DESCRIPTION = "Bluetooth(TM) Firmware. Package contains firmware images for some \
   Bluetooth(TM) adapters. Currently supported are: * Broadcom \
   Corporation BCM2033 \
 \
* AVM Computersysteme Vertriebs GmbH BLUEFRITZ! USB \
 \
The BLUETOOTH trademarks are owned by Bluetooth SIG, Inc., USA."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & SUSE-Firmware"

PV = "1.2"

RPM_NAME = "bluez-firmware-1.2-150.2.aarch64.rpm"
RPM_HASH = "3542517632e75331ca8ca78dff31f6fd061f289c723a7ba5d47196031ee7b602e6486809cf74fc48da53f6d5c952d655577832fc213eace5f5acb8c3dad3d608"

RPROVIDES:${PN} += "bluez-firmware bluez-firmware(aarch-64) firmware(BCM2033-FW.bin) firmware(BCM2033-MD.hex) firmware(STLC2500_R4_00_03.ptc) firmware(STLC2500_R4_00_06.ssf) firmware(STLC2500_R4_02_02_WLAN.ssf) firmware(STLC2500_R4_02_04.ptc) firmware(bfubase.frm)"
RDEPENDS:${PN} += ""

inherit rpm
