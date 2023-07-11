SUMMARY = "Application turning the RTL2832 dongle into a 433.92MHz generic data receiver"
DESCRIPTION = "An application using librtlsdr to decode the temperature from \
wireless temperature sensors (433.92MHz)"
LICENSE = "GPL-2.0-only"

PV = "22.11"

RPM_NAME = "rtl_433-22.11-1.4.aarch64.rpm"
RPM_HASH = "8e9a87ebd246ca979dc54cfe5006979a749abda47b3d7af7689533e1aeb4947416f95f251e85dc5cb72c48b9a58e4ffec1d3a1b502f6ba6863a3fb19fef9856c"

RPROVIDES:${PN} += "config-rtl-433 \
rtl-433"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8 \
libc.so.6 \
libm.so.6 \
librtlsdr.so.0 \
libusb-1.0.so.0"

inherit rpm
