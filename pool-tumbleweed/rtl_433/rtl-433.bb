SUMMARY = "Application turning the RTL2832 dongle into a 433.92MHz generic data receiver"
DESCRIPTION = "An application using librtlsdr to decode the temperature from \
wireless temperature sensors (433.92MHz)"
LICENSE = "GPL-2.0-only"

PV = "22.11"

RPM_NAME = "rtl_433-22.11-1.3.aarch64.rpm"
RPM_HASH = "8128a97621afccf29a7b00dd0985dd601c87d207b85f28dee1edbfc9b13722d4e50a443a38a5bfb76143d7feafc6b6054f87f23892521367ba8e8c642964a086"

RPROVIDES:${PN} += "config(rtl_433) \
rtl_433 \
rtl_433(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSoapySDR.so.0.8()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
librtlsdr.so.0()(64bit) \
libusb-1.0.so.0()(64bit)"

inherit rpm