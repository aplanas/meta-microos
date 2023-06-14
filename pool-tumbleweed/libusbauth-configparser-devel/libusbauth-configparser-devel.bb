SUMMARY = "Development part of library for USB Firewall including flex/bison parser"
DESCRIPTION = "Development part of library to read usbauth config file into data structures"
LICENSE = "LGPL-2.1-only"

PV = "1.0.5"

RPM_NAME = "libusbauth-configparser-devel-1.0.5-1.3.aarch64.rpm"
RPM_HASH = "a9c3819a79e09f71d204167be634168dcf597414aa7952d5bfc683639de368b8e059ec63bb6c802a26d2b87f88043f278e25cf8b6f74bd9a32dc20830489b05f"

RPROVIDES:${PN} += "libusbauth-configparser-devel \
pkgconfig-libusbauth-configparser"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libusbauth-configparser1"

inherit rpm
