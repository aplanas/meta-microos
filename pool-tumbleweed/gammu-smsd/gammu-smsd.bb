SUMMARY = "SMS message daemon"
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
This package contains the Gammu SMS Daemon and tool to inject messages \
into the queue."
LICENSE = "GPL-2.0-only"

PV = "1.42.0"

RPM_NAME = "gammu-smsd-1.42.0-4.7.aarch64.rpm"
RPM_HASH = "7adb5b943a0a256daaef052a3a47372d810d65e8e95be1015a4593aed20c6d160fd305616d3103ec4440a90eb7995f5bcdee7aa3227c956beec3801428ddb8c6"

RPROVIDES:${PN} += "config-gammu-smsd \
gammu-smsd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libGammu.so.8 \
libc.so.6 \
libgsmsd.so.8"

inherit rpm
