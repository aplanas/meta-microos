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

RPM_NAME = "jpnevulator-2.3.6-1.12.aarch64.rpm"
RPM_HASH = "86a49aafcf850822dcc44d16e0018518a6329d1884b73aa5cc424aff18686ceedaefa67fa21a24afd070ee54b791f5ab972e1ae1acf294aef6b5903f7e483b36"

RPROVIDES:${PN} += "jpnevulator"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
