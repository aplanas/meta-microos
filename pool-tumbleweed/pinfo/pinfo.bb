SUMMARY = "Lynx-style Info Browser"
DESCRIPTION = "Pinfo is a curses based, Lynx-style info browser."
LICENSE = "GPL-2.0-only"

PV = "0.6.13"

RPM_NAME = "pinfo-0.6.13-2.8.aarch64.rpm"
RPM_HASH = "43d4281857c557514b2a55de9d5f4d2392318c93bb7cd269cbb37b59e7b3a4a421bcb5153ec534e8b60a90ccfd85f776e5d91c1d7abc35c57ba57c8833b6b753"

RPROVIDES:${PN} += "config-pinfo \
pinfo"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
