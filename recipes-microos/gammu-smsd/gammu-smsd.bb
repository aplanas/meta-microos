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

RPM_NAME = "gammu-smsd-1.42.0-4.6.aarch64.rpm"
RPM_HASH = "044f9ce6abc8ba006ed40cbfec618066b894c5b0a70c72778dfd5a37737f361aae057f991187339355fbe77e11544b488d580f91500dfbdfb92dcfbed0ee0f09"

RPROVIDES:${PN} += "config(gammu-smsd) \
gammu-smsd \
gammu-smsd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGammu.so.8()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgsmsd.so.8()(64bit)"

inherit rpm
