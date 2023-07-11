SUMMARY = "Library for accessing CMIS-enabled servers"
DESCRIPTION = "libcmis is a C++ client library for the CMIS (Content Management \
Interoperability Services) interface. This library allows C++ \
applications to connect to any CMIS-enabled repositories."
LICENSE = "MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "0.5.2"

RPM_NAME = "libcmis-0_5-5-0.5.2-1.25.aarch64.rpm"
RPM_HASH = "6aa79e49a8b8a28cd1b3b724e84dbe7072ccb06651d2ad9dee2e11570947763d7e0ec7cb2c24d4bff46702fcbec51441a4a34450eccaf217a4ab1faa1071c0f9"

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
