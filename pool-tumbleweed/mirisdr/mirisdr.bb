SUMMARY = "Support programs for MRi2500"
DESCRIPTION = "Programs that controls Mirics MRi2500 based DVB dongle in raw mode, so \
it can be used as a SDR receiver."
LICENSE = "GPL-2.0"

PV = "0.0.0+git.20130608"

RPM_NAME = "mirisdr-0.0.0+git.20130608-1.24.aarch64.rpm"
RPM_HASH = "183d61c5b8af35901ed0e00cf410128337a9dfb8edd0435a153a58f8ab13a86d5cf4200c70b2bafdc58d6978bf789ea4914d7f233b72ec3b74ed1e9f4f9e7043"

RPROVIDES:${PN} += "mirisdr \
mirisdr(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libusb-1.0.so.0()(64bit)"

inherit rpm
