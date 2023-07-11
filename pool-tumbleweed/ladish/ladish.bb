SUMMARY = "LADI Session Handler"
DESCRIPTION = "LADI Session Handler or simply ladish is a session management system for JACK applications on GNU/Linux."
LICENSE = "AFL-2.1 & GPL-2.0-or-later"

PV = "1+git.20210227"

RPM_NAME = "ladish-1+git.20210227-3.8.aarch64.rpm"
RPM_HASH = "50140ae53558d7f23ff64440bc586310d92632dcee2502b19d9ebbaae916f0885df0a9fdb1cf8b71605dd4404dea5b7c4945d9269ae4159c047936d1811fbd95"

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
