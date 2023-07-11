SUMMARY = "Ftdi LIRC User-Space Driver"
DESCRIPTION = "LIRC user-space driver which works together with the kernel, providing \
full support for the ftdi device."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "lirc-drv-ftdi-0.10.1-10.2.aarch64.rpm"
RPM_HASH = "328f8663c740b7f552be4b9aa6aeb2dd51f7dcf4d96d9dfaab48f877fdfc0d6f881eec2a2dc28a7158d97664967f2b71fd22502e52c2f33d8ed2d1d04e92c85b"

RPROVIDES:${PN} += "lirc-drv-ftdi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libftdi1.so.2 \
liblirc-driver.so.0 \
liblirc.so.0 \
libusb-1.0.so.0 \
lirc-core"

inherit rpm
