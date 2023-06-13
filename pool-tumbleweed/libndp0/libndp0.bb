SUMMARY = "Libraries and header files for libndp development"
DESCRIPTION = "This package contains a library which provides a wrapper for IPv6 Neighbor \
Discovery Protocol."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8"

RPM_NAME = "libndp0-1.8-1.6.aarch64.rpm"
RPM_HASH = "b4fd3e9a62b4667aebe83fb3acbbc8b27bc6b9d91df26ffc701c73bce0e70f9b079cb771e016a5b1feb030016b494662573e91997afbb232d62e406d8b6f233f"

RPROVIDES:${PN} += "libndp.so.0()(64bit) \
libndp0 \
libndp0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
