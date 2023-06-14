SUMMARY = "Library for accessing CMIS-enabled servers"
DESCRIPTION = "libcmis is a C++ client library for the CMIS (Content Management \
Interoperability Services) interface. This library allows C++ \
applications to connect to any CMIS-enabled repositories."
LICENSE = "MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "0.5.2"

RPM_NAME = "libcmis-0_5-5-0.5.2-1.24.aarch64.rpm"
RPM_HASH = "f09d3cab793a9cad2d0162153889bb2782c4074f18bcbd16a16fdfa5296acb15ae71b53523364c7f867df756b695ec5acb365868dcbfb808140e28c997e2eb04"

RPROVIDES:${PN} += "libcmis-0-5-5 \
libcmis-0.5.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxml2.so.2"

inherit rpm
