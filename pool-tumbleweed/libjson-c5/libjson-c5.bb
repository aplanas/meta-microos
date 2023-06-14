SUMMARY = "JSON-C shared library"
DESCRIPTION = "JSON-C implements a reference counting object model that allows you to \
easily construct JSON objects in C, output them as JSON formatted \
strings and parse JSON formatted strings back into the C \
representation of JSON objects. \
 \
This package includes the JSON library."
LICENSE = "MIT"

PV = "0.16"

RPM_NAME = "libjson-c5-0.16-1.6.aarch64.rpm"
RPM_HASH = "a286f8c4987bd965f2c98f2f4552f15cdbbcf53312a7fe8ffaf3d410ff8ad6184cf5f7483de4f62bf46c1f04ba884d78db5f058185d4435490805ee908031834"

RPROVIDES:${PN} += "libjson-c.so.5 \
libjson-c5"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
