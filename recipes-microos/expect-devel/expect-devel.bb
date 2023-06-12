SUMMARY = "Header Files and C API Documentation for expect"
DESCRIPTION = "This package contains header files and documentation needed for linking \
to expect from programs written in compiled languages like C, C++, etc. \
 \
This package is not needed for developing scripts that run under the \
/usr/bin/expect interpreter, or any other Tcl interpreter with the \
expect package loaded."
LICENSE = "SUSE-Public-Domain"

PV = "5.45.4"

RPM_NAME = "expect-devel-5.45.4-6.8.aarch64.rpm"
RPM_HASH = "09b4b0fea837b1d13c0494d61493c90ad555e0f4bc46b199ae9d24f4b637782322b25a8dcc7e27f8dc35d02f3b812f28c7270be5db43a50429f9af7fd6eda6aa"

RPROVIDES:${PN} += "expect-devel \
expect-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
