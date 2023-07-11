SUMMARY = "IDL Parsing Library"
DESCRIPTION = "LibIDL is a small library for creating parse trees of CORBA \
v2.2-compliant Interface Definition Language (IDL) files. IDL is a \
specification for defining interfaces that can be used between \
different CORBA implementations."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.14"

RPM_NAME = "libIDL-2-0-0.8.14-23.25.aarch64.rpm"
RPM_HASH = "3688e1e7f90dfb04377e03311edcfef653537120a171f2b4c47eb09b93a5b04f053e153d3f702006aa19f773ff0a08f89fafac827065762c9c83086ed2bce753"

RPROVIDES:${PN} += "libIDL-2-0 \
libIDL-2.so.0 \
libidl"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
