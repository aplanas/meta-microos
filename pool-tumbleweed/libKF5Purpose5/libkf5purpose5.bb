SUMMARY = "Framework to integrate services and actions - core library"
DESCRIPTION = "This framework offers the possibility to create integrate services and actions \
on any application without having to implement them specifically. Purpose will \
offer them mechanisms to list the different alternatives to execute given the \
requested action type and will facilitate components so that all the plugins \
can receive all the information they need. \
 \
This package contains the core library files of the package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5Purpose5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "58b1dde17cbd0b0d806a0e3a2f423108c1c5122b6aa9bb321962d6a607f28613131b99d0b9a7b1b8ff9bc28fef98a880ff467ae7f1fc62e6f51af0ec205e6447"

RPROVIDES:${PN} += "libKF5Purpose.so.5 \
libKF5Purpose5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
