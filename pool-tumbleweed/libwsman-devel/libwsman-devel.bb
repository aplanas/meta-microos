SUMMARY = "Development files for OpenWSMAN"
DESCRIPTION = "OpenWSMAN is an implementation of the WS-Management protocol stack. \
 \
This subpackage provides the header files for its libraries."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "libwsman-devel-2.7.2-2.8.aarch64.rpm"
RPM_HASH = "62ff3d46c6600cc95bff3e4c74a2d533593c3b26ec7aefccbbce56701c03af8968b15a6a6f04473570a52659a43db960f799966c4ac511462f5a43b1f5e35099"

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
