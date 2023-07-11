SUMMARY = "D-Bus Message Bus System"
DESCRIPTION = "D-Bus contains some tools that require Xlib to be installed, those are \
in this separate package so server systems need not install X."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "1.14.8"

RPM_NAME = "dbus-1-x11-1.14.8-1.1.aarch64.rpm"
RPM_HASH = "f475f5340400263f7acb1fd5e079dc8dfbd1a5ad0e825a6d6d655b118d5a4732072de0d05224b055e4022227291c169bd1b79d39dce69e047b4ee07f115980c2"

RPROVIDES:${PN} += "dbus-1-x11 \
dbus-launch"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libdbus-1.so.3"

inherit rpm
