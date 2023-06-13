SUMMARY = "Development headers and libraries for json-c"
DESCRIPTION = "JSON-C implements a reference counting object model that allows you to \
easily construct JSON objects in C, output them as JSON formatted \
strings and parse JSON formatted strings back into the C \
representation of JSON objects. \
 \
This package includes header files and scripts needed for developers \
using the json-c library"
LICENSE = "MIT"

PV = "0.16"

RPM_NAME = "libjson-c-devel-0.16-1.6.aarch64.rpm"
RPM_HASH = "0e8c759bdc7a75318601642202039ebcc5d4338dcbcc3ba149a627847a9daca3f5e21f04f504ea6bb77082e1e3110700b87912add85ce1c23d067a0f8a7e5b33"

RPROVIDES:${PN} += "cmake(json-c) \
libjson-c-devel \
libjson-c-devel(aarch-64) \
libjson-devel \
pkgconfig(json) \
pkgconfig(json-c)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjson-c5"

inherit rpm
