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

RPM_NAME = "gammu-1.42.0-4.7.aarch64.rpm"
RPM_HASH = "9284fe9b677a6113d1e4965b4bd51f13e47e3341b140f24e73f56047c89aa1e3d078e0c85ab163097c457f6c048d1b3d528f71a83d198f6c676f946aae510bab"

RPROVIDES:${PN} += "gammu"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
dialog \
ld-linux-aarch64.so.1 \
libGammu.so.8 \
libbluetooth.so.3 \
libc.so.6 \
libcurl.so.4 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0"

inherit rpm
