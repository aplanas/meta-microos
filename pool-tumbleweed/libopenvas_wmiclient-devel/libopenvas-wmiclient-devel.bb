SUMMARY = "Development files for the OpenVAS wmiclient library"
DESCRIPTION = "The support libraries for the Greenbone Vulnerability Management framework. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libopenvas_wmiclient."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.5"

RPM_NAME = "libopenvas_wmiclient-devel-1.0.5-2.2.aarch64.rpm"
RPM_HASH = "0238b82164d364fa658a1664f3f3006088d61b623b58c1d3c4048628a4aee71eed0b131736cd002505e4d875c33f0cee1e84a4485ea9da38908f78fa53b8f02c"

RPROVIDES:${PN} += "libopenvas-wmiclient-devel \
pkgconfig-libopenvas-wmiclient"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenvas-wmiclient1"

inherit rpm
