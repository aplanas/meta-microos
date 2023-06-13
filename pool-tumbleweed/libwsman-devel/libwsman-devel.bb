SUMMARY = "Development files for OpenWSMAN"
DESCRIPTION = "OpenWSMAN is an implementation of the WS-Management protocol stack. \
 \
This subpackage provides the header files for its libraries."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "libwsman-devel-2.7.2-2.5.aarch64.rpm"
RPM_HASH = "57827fa34cdbcc1ed5b9b2e6fcb73647e46351d57a14186f46d3b47ecaa3dabe656f0e9c78a031582fa5429c8eb7e997c64189232d5e28915338d19a1082eed6"

RPROVIDES:${PN} += "libwsman-devel \
libwsman-devel(aarch-64) \
openwsman-devel \
pkgconfig(openwsman) \
pkgconfig(openwsman++) \
pkgconfig(openwsman-server)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwsman1 \
libwsman_client5 \
libxml2-devel \
openwsman-server \
pam-devel \
sblim-sfcc-devel"

inherit rpm
