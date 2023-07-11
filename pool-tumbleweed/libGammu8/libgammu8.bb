SUMMARY = "Mobile phone management library"
DESCRIPTION = "Gammu is command line utility and library to work with mobile phones \
from many vendors. Support for different models differs, but basic \
functions should work with majority of them. Program can work with \
contacts, messages (SMS, EMS and MMS), calendar, todos, filesystem, \
integrated radio, camera, etc. It also supports daemon mode to send and \
receive SMSes. \
 \
Currently supported phones include: \
 \
* Many Nokia models. \
* Alcatel BE5 (501/701), BF5 (715), BH4 (535/735). \
* AT capable phones (Siemens, Nokia, Alcatel, IPAQ). \
* OBEX and IrMC capable phones (Sony-Ericsson, Motorola). \
* Symbian phones through gnapplet. \
 \
This package contains the Gammu shared library."
LICENSE = "GPL-2.0-only"

PV = "1.42.0"

RPM_NAME = "libGammu8-1.42.0-4.7.aarch64.rpm"
RPM_HASH = "0de8e05deb204de4863743e1526e36e85ee66a393fdc7d23f7276754139bbe6484c71579e6a903d38f987c700f2fa65de52129464a0252d407be5b23794301f8"

RPROVIDES:${PN} += "libGammu.so.8 \
libGammu8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbluetooth.so.3 \
libc.so.6 \
libglib-2.0.so.0 \
libm.so.6 \
libusb-1.0.so.0"

inherit rpm
