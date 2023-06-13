SUMMARY = "Serial Sniffer"
DESCRIPTION = "jpnevulator is a serial sniffer. It can be used to send data on a \
serial device, too. It can read or write from/to one or more serial \
devices at the same time. \
 \
In write mode, data to be sent on the serial device(s) is read from a \
file or stdin in hexadecimal notation. Data is sent on the serial \
device(s) line by line. \
 \
In read mode, data to be read from the serial device(s) is written to a \
file or stdout in hexadecimal notation. It is possible to pass the \
data in between the serial device(s). Several options enhance the \
way the data is displayed."
LICENSE = "GPL-2.0-only"

PV = "2.3.6"

RPM_NAME = "jpnevulator-2.3.6-1.11.aarch64.rpm"
RPM_HASH = "35b905ddb2bc420bb7cddf4e15de7f26153dea11c36c316a592fd48c444aeeea7caf1fcba80efb3d079b8b302580b7d57c7447108ad6ae08d08e940e4174f419"

RPROVIDES:${PN} += "jpnevulator \
jpnevulator(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
