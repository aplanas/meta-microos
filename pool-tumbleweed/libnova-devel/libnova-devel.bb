SUMMARY = "Development files for libnova"
DESCRIPTION = "This package contains development files for libnova."
LICENSE = "LGPL-2.0+"

PV = "0.15.0"

RPM_NAME = "libnova-devel-0.15.0-10.30.aarch64.rpm"
RPM_HASH = "d6374a57a76d40d83590757dc2814f36c6ed1b9426859e2e54d66e3774dfe70c99a4c33d19f807a3c8b66642f970ea0c92423f1c014c677b5dc6193600e5d793"

RPROVIDES:${PN} += "libnova-devel"

RDEPENDS:${PN} += "glibc-devel \
libc.so.6 \
libnova-0-15-0 \
libnova-0.15.so.0"

inherit rpm
