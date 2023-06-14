SUMMARY = "LADI Session Handler"
DESCRIPTION = "LADI Session Handler or simply ladish is a session management system for JACK applications on GNU/Linux."
LICENSE = "AFL-2.1 & GPL-2.0-or-later"

PV = "1+git.20210227"

RPM_NAME = "ladish-1+git.20210227-3.7.aarch64.rpm"
RPM_HASH = "5dea421d5218177a196c0559d33a494cd681ef92c80eb22cfa50ea35c4a0b0cdd3e66f1cd777428e3ad7bf963170a4a5f89489016db7e129e49fead7819024ca"

RPROVIDES:${PN} += "ladish \
libalsapid.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
a2jmidid \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libexpat.so.1 \
libjack.so.0 \
libuuid.so.1"

inherit rpm
