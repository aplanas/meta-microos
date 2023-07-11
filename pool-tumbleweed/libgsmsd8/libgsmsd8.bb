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

RPM_NAME = "libgsmsd8-1.42.0-4.7.aarch64.rpm"
RPM_HASH = "b551db65286c283831d62ebe1453134d7186e43dbba08d238abecbc05145604cdf6a42877a257d5709e168d689e164f3dca184961fe886bba8c4b1045645d724"

RPROVIDES:${PN} += "libgsmsd.so.8 \
libgsmsd8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGammu.so.8 \
libc.so.6 \
libmariadb.so.3 \
libodbc.so.2 \
libpq.so.5"

inherit rpm
