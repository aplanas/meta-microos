SUMMARY = "Industrial I/O library"
DESCRIPTION = "Library for industrial I/O."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24"

RPM_NAME = "libiio0-0.24-1.5.aarch64.rpm"
RPM_HASH = "77219ad9c362609d796da1ab16cb653474e33df5139eff60abec327ed7eff73af738ff1bf00f3862e7e8f4da17ae766225cb77d3cfc1bad877befa43e961fdb7"

RPROVIDES:${PN} += "libiio.so.0 \
libiio0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libusb-1.0.so.0 \
libxml2.so.2"

inherit rpm
