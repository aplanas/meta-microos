SUMMARY = "Development files for OpenWSMAN"
DESCRIPTION = "OpenWSMAN is an implementation of the WS-Management protocol stack. \
 \
This subpackage provides the header files for its libraries."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "libwsman-devel-2.7.2-2.9.aarch64.rpm"
RPM_HASH = "da389f3002d1ef8f665971a7698794fbe3a8b718cfa5f63b04a381028f907fa23bedfee304f0b66ae49eb1b881cf9b125257122a684c63a917bd0efd68bcfd96"

RPROVIDES:${PN} += "libwsman-devel \
openwsman-devel \
pkgconfig-openwsman \
pkgconfig-openwsman++ \
pkgconfig-openwsman-server"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwsman-client5 \
libwsman1 \
libxml2-devel \
openwsman-server \
pam-devel \
sblim-sfcc-devel"

inherit rpm
