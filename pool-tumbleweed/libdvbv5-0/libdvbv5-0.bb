SUMMARY = "Library that provides access to DVB adapter cards"
DESCRIPTION = "libdvbv5 is a library meant to be used by digital TV applications that need to \
talk with media hardware. \
 \
This package contains shared lib for packages that use libdvbv5."
LICENSE = "GPL-2.0-only"

PV = "1.24.1"

RPM_NAME = "libdvbv5-0-1.24.1-1.4.aarch64.rpm"
RPM_HASH = "0af8a898de5eda5e8e29ad3d39e6b9da6157b7f9882eefa9a6d68a673deb582a4afa3e3ddf85f0cef37a6d70a854fda6697c741f51f28016fddecb07366f4580"

RPROVIDES:${PN} += "libdvbv5-0 \
libdvbv5.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libudev.so.1"

inherit rpm
