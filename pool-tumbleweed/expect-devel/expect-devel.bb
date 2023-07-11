SUMMARY = "Header Files and C API Documentation for expect"
DESCRIPTION = "This package contains header files and documentation needed for linking \
to expect from programs written in compiled languages like C, C++, etc. \
 \
This package is not needed for developing scripts that run under the \
/usr/bin/expect interpreter, or any other Tcl interpreter with the \
expect package loaded."
LICENSE = "SUSE-Public-Domain"

PV = "5.45.4"

RPM_NAME = "expect-devel-5.45.4-6.9.aarch64.rpm"
RPM_HASH = "563ea98e2ff4cb8f100ddae3b16bfcfcbaf8c13aaf754d28b11252249b0d56159680b7a0307ff21d68f28c180a4041f940dbc9a0cc0f6be2792e130fdff03fc1"

RPROVIDES:${PN} += "expect-devel"

RDEPENDS:${PN} += ""

inherit rpm
