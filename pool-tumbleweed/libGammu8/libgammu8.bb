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

RPM_NAME = "libGammu8-1.42.0-4.6.aarch64.rpm"
RPM_HASH = "50b25b223895c8db4c7157823b9afe86a5c31834b20484222d7d814aceaff162e48009c818e0af56902f07deb01732d788aa42cc5504458500216a8e9586f39b"

RPROVIDES:${PN} += "libGammu.so.8()(64bit) \
libGammu8 \
libGammu8(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libbluetooth.so.3()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libusb-1.0.so.0()(64bit)"

inherit rpm
