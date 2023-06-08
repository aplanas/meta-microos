SUMMARY = "DFU firmware upgrade utility"
DESCRIPTION = "This is a host side implementation of the DFU 1.0 and DFU 1.1 specifications of \
the USB forum. DFU is intended to download and upload firmware to/from devices \
connected over USB. It ranges from small devices like micro-controller boards \
to mobile phones."
LICENSE = "GPL-2.0-only"

PV = "0.11"

RPM_NAME = "dfu-util-0.11-2.3.aarch64.rpm"
RPM_HASH = "fb8abf556d81eedd8105ce0beba0797af6cdfde6de66bfc1bb48e8e6af867cb4dd745c6a9f74ffa698f8f86fc7208b3f95767756c86bc95002222766cc9023f2"

RPROVIDES:${PN} += "dfu-util dfu-util(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libusb-1.0.so.0()(64bit)"

inherit rpm
