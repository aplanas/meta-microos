SUMMARY = "Mobile phone management utility"
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
This package contains Gammu binary as well as some examples."
LICENSE = "GPL-2.0-only"

PV = "1.42.0"

RPM_NAME = "gammu-1.42.0-4.6.aarch64.rpm"
RPM_HASH = "7bb48690dbb902712aa504a542db573f3e6d43d04570122400024ddd1e39d4b6a1dd374398187a7a811629b5f4460ff86611d0351a981704fb4d1b78b46a604e"

RPROVIDES:${PN} += "gammu \
gammu(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
dialog \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGammu.so.8()(64bit) \
libbluetooth.so.3()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcurl.so.4()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgudev-1.0.so.0()(64bit)"

inherit rpm
