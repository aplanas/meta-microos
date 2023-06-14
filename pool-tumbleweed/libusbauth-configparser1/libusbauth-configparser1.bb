SUMMARY = "Library for USB Firewall including flex/bison parser"
DESCRIPTION = "Library to read usbauth config file into data structures"
LICENSE = "LGPL-2.1-only"

PV = "1.0.5"

RPM_NAME = "libusbauth-configparser1-1.0.5-1.3.aarch64.rpm"
RPM_HASH = "f6f93b4bdad3ba31c08dff9de28346189026c00899bf116cd72947e525a4b0e57e51705633dfd977ecbe6a3b7c79c3915c398e00fc6c687d4e2207c666f6a75a"

RPROVIDES:${PN} += "libusbauth-configparser.so.1 \
libusbauth-configparser1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libudev.so.1"

inherit rpm
