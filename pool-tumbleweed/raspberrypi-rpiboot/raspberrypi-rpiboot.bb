SUMMARY = "Raspberry Pi rpiboot tool"
DESCRIPTION = "The raspberrypi-usbboot allows you to flash the eMMC through an USB cable."
LICENSE = "Apache-2.0"

PV = "0~git0.e5e4994"

RPM_NAME = "raspberrypi-rpiboot-0~git0.e5e4994-1.5.aarch64.rpm"
RPM_HASH = "cc7167ede03370b68b0dfbad018b2f6da74096ee644e3b82d7b4586dd0fb87b8f7254174991cffc04927cb90c6c545dd55a8de03ba1652e7c306823a5ecf98d2"

RPROVIDES:${PN} += "raspberrypi-rpiboot \
raspberrypi-rpiboot(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.34)(64bit) \
libusb-1.0.so.0()(64bit)"

inherit rpm
