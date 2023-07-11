SUMMARY = "Development part of library for USB Firewall including flex/bison parser"
DESCRIPTION = "Development part of library to read usbauth config file into data structures"
LICENSE = "LGPL-2.1-only"

PV = "1.0.5"

RPM_NAME = "libusbauth-configparser-devel-1.0.5-1.4.aarch64.rpm"
RPM_HASH = "77861ee512383c99f06e80fccb8613858fb123e95fcc13b95624144afc321b6af438802aeb667b8e009fd7bcc5f0e00155fcc6a6813320c9052f7d2aaebae2b1"

RPROVIDES:${PN} += "libusbauth-configparser-devel \
pkgconfig-libusbauth-configparser"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libusbauth-configparser1"

inherit rpm
