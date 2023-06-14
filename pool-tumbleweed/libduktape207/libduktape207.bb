SUMMARY = "The core library for duktape"
DESCRIPTION = "Embeddable Javascript engine. \
 \
This package contains the shared library."
LICENSE = "MIT"

PV = "2.7.0"

RPM_NAME = "libduktape207-2.7.0-1.1.aarch64.rpm"
RPM_HASH = "e3adb3e9e646a687721d29eaa6df8b32bf2a5211d672d48edcdb2593f9979a918df322ed64f09358a8b687e7ee2bddb083c1c37071cc6971a1632bef85a43b47"

RPROVIDES:${PN} += "libduktape.so.207 \
libduktape207 \
libduktaped.so.207"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libm.so.6"

inherit rpm
