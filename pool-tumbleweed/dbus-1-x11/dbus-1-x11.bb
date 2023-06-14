SUMMARY = "D-Bus Message Bus System"
DESCRIPTION = "D-Bus contains some tools that require Xlib to be installed, those are \
in this separate package so server systems need not install X."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "1.14.6"

RPM_NAME = "dbus-1-x11-1.14.6-2.3.aarch64.rpm"
RPM_HASH = "6ac8a52245db4f9c72496a6e94c0e9a5505506b6dc2328d16ff2c58b998642a3a85d74552318d682d55133ee2f791f0a894b599e29fe23bf7b3c1624cd499669"

RPROVIDES:${PN} += "dbus-1-x11 \
dbus-launch"

RDEPENDS:${PN} += "/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libdbus-1.so.3"

inherit rpm
