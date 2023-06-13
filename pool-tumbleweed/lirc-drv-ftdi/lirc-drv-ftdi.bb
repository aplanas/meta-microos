SUMMARY = "Ftdi LIRC User-Space Driver"
DESCRIPTION = "LIRC user-space driver which works together with the kernel, providing \
full support for the ftdi device."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "lirc-drv-ftdi-0.10.1-10.1.aarch64.rpm"
RPM_HASH = "33df61436a3eca3c6402f01544dee05b2205d641c5accc8276cbeb4cc2ab9062a32b939a71da2ef56e6f8170076a6de362dd88afe65b95f761cad47ef7f77a64"

RPROVIDES:${PN} += "lirc-drv-ftdi \
lirc-drv-ftdi(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libftdi1.so.2()(64bit) \
liblirc.so.0()(64bit) \
liblirc_driver.so.0()(64bit) \
libusb-1.0.so.0()(64bit) \
lirc-core"

inherit rpm
