SUMMARY = "Mgetty Listens for Data, Fax, or Voice Calls on a Serial Line"
DESCRIPTION = "This package turns your computer into a fax machine. With some voice \
modems (Zyxel, Rockwell, and USR), you can even use your computer as an \
answering machine. \
 \
Mgetty recognizes what kind of call it is receiving and does everything \
else automatically. It is able to accept data (login/PPP), fax, and \
(depending on your modem) voice calls. Find the documentation in \
/usr/share/doc/packages/mgetty and TeX Info files in /usr/share/info. \
 \
The configuration files are in /etc/mgetty+sendfax."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "mgetty-1.2.1-9.3.aarch64.rpm"
RPM_HASH = "f2a2df4602c1a7997d1c9f07e0659ec45818d9c0e1cd716058ae5a95bcbd7367e2c65622859c120e8648a23a6901991e72e60d77cd4672ca0b3711eabb8486aa"

RPROVIDES:${PN} += "config-mgetty \
mgetty"

RDEPENDS:${PN} += "/bin/sh \
g3utils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
systemd"

inherit rpm
