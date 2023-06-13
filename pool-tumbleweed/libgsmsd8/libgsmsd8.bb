SUMMARY = "SMS daemon helper library"
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
This package contains the Gammu SMS daemon shared library."
LICENSE = "GPL-2.0-only"

PV = "1.42.0"

RPM_NAME = "libgsmsd8-1.42.0-4.6.aarch64.rpm"
RPM_HASH = "e9c2f87c7f544b8e1bc0e88aa5a3067f410b676054a0128500ab5501e34137b6322f822f1e6626e1e103fb740277e6b474bc7cb85cc764cbbd8254c064ca6212"

RPROVIDES:${PN} += "libgsmsd.so.8()(64bit) \
libgsmsd8 \
libgsmsd8(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGammu.so.8()(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit) \
libodbc.so.2()(64bit) \
libpq.so.5()(64bit)"

inherit rpm
