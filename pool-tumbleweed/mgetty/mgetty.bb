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

RPM_NAME = "mgetty-1.2.1-9.4.aarch64.rpm"
RPM_HASH = "55e9918c5e743b61182c1532ea78d08f6e6142404de852925f278a27e327a27159df15704183f730ce42ca28215e4a7f3a1049f7c195ef2143d1c7111515615d"

RPROVIDES:${PN} += "config-mgetty \
mgetty"

RDEPENDS:${PN} += "/usr/bin/sh \
g3utils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
systemd"

inherit rpm
