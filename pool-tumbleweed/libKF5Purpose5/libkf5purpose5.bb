SUMMARY = "Framework to integrate services and actions - core library"
DESCRIPTION = "This framework offers the possibility to create integrate services and actions \
on any application without having to implement them specifically. Purpose will \
offer them mechanisms to list the different alternatives to execute given the \
requested action type and will facilitate components so that all the plugins \
can receive all the information they need. \
 \
This package contains the core library files of the package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5Purpose5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "5ba0386bcf8892edf84e3c19ade855f998d583d7a3391cb074bf28b0384b7c69eb844ffd02e413e616c07abf24f3f641231d3714277376defadcbe3f5167c4c6"

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
