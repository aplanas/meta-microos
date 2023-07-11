SUMMARY = "Development files for Gammu"
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
This package contain files needed for development."
LICENSE = "GPL-2.0-only"

PV = "1.42.0"

RPM_NAME = "gammu-devel-1.42.0-4.7.aarch64.rpm"
RPM_HASH = "b25645424d0c3f7dd2ae0607ff2b49456ba22ab6c82bf6be8115682ccdb49d2660c6ed859e4d41adc83297463bf0fd785056e3ffa1905a96a2b00fa260671b90"

RPROVIDES:${PN} += "gammu-devel \
pkgconfig-gammu \
pkgconfig-gammu-smsd"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libGammu8 \
libgsmsd8 \
pkgconfig \
pkgconfig-gammu"

inherit rpm
